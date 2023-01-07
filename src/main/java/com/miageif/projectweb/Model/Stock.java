package com.miageif.projectweb.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
    @Id
    @GeneratedValue(generator = "user_id_sequence")
    private Integer idStock;
    @Column(name = "stock_keye")
    private String stockKey;

    public Stock(String keyStock){
        this.setStockKey(keyStock);
    }
}
