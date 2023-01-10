
package com.miageif.projectweb.Controller;

import com.miageif.projectweb.Model.Search;
import com.miageif.projectweb.Model.Stock;
import com.miageif.projectweb.Model.User;
import com.miageif.projectweb.Repository.SearchRepository;
import com.miageif.projectweb.Repository.StockRepository;
import com.miageif.projectweb.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.isNull;

@RestController
@AllArgsConstructor
public class SearchApi {
    @Autowired
    private final SearchRepository searchRepository;
    private final UserRepository userRepository;
    private final StockRepository stockRepository;

    @GetMapping("search/user/{username}")
    public List<Search> findAllByUser(String username){
        return searchRepository.findAllByUser(userRepository.findByUsername(username).orElse(null));
    }
    @GetMapping("search/stock/{stock_key}")
    public List<Search> findAllByStock(@PathVariable String stock_key){
        return searchRepository.findAllByStock(stockRepository.findByStockKey(stock_key).orElse(null));
    }

    @GetMapping("searches/")
    public List<Search> findAll(){
        return searchRepository.findAll();
    }



    @PostMapping("search/{username}/{stock_key}")
    public Search saveByUsernameStockId(@PathVariable String username, @PathVariable String stock_key){
        User user = userRepository.findByUsername(username).orElse(null);
        Stock stock = stockRepository.findByStockKey(stock_key).orElse(null);
        Date date = new Date();
        if(isNull(user) ){
            user= userRepository.save(new User(username));
        }
        if(isNull(stock) ){
            stock= stockRepository.save(new Stock(stock_key));
        }
        Search search = new Search(user, stock, date);
        return searchRepository.save(search);

    }

//    @GetMapping("search/stock_by_date/{stock_key}/{date1}/{date2}")
//    public List<Search> findAllStockBetween(@PathVariable stock_key, @PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date date1, @PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date date2){
//        return searchRepository.findAll;
//    }

}

