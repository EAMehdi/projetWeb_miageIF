package com.miageif.projectweb.Repository;

import com.miageif.projectweb.Model.Stock;
import com.miageif.projectweb.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository extends JpaRepository<Stock,Integer> {
    public Optional<Stock> findById(Integer u);
    public Optional<Stock> findByStockKey(String stockKey);
    //public User save(User u);
    public void deleteById(Integer id);
}
