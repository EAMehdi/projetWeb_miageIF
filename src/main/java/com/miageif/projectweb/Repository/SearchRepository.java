package com.miageif.projectweb.Repository;

import com.miageif.projectweb.Model.Search;
import com.miageif.projectweb.Model.Stock;
import com.miageif.projectweb.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SearchRepository extends JpaRepository<Search,Integer> {
    public List<Search> findByIdSearch(Integer i);
    public List<Search> findAllByUser(User u);
    public List<Search> findAllByStock(Stock s);

    public List<Search> findAllByStockAndSearchTimestampAfter(Stock s, Date searchTimestamp);

    // all the methods are written by themselves
}

