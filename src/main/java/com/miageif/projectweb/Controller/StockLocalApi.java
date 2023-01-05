package com.miageif.projectweb.Controller;

import com.miageif.projectweb.Model.Stock;
import com.miageif.projectweb.Repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class StockLocalApi {
    @Autowired
    private final StockRepository stockRepository;

    @GetMapping("local_stock/{stock_key}")
    public Optional<Stock> findUserByStockKey(@PathVariable String stock_key){
        return stockRepository.findByStockKey(stock_key);
    }

    @PostMapping("local_stock/{stock_key}")
    public Stock saveStock(@PathVariable String stock_key){
        Optional<Stock> optionalStock = stockRepository.findByStockKey(stock_key);
        return stockRepository.save(optionalStock.orElse(new Stock(stock_key)));
    }


}
