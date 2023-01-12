
package com.miageif.projectweb.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "stock")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
    @Id
    @GeneratedValue(generator = "stock_id")
    private Integer idStock;


    @Column(name = "stock_keye", unique = true)
    private String stockKey;

    public Stock(String keyStock){
        this.setStockKey(keyStock.toUpperCase());
    }
}

