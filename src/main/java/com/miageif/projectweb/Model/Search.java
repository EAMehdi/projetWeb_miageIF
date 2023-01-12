package com.miageif.projectweb.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.Optional;

@Data
@Entity
@Table(name = "stock_search")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Search {
    @Id
    @GeneratedValue(generator = "search_id")
    private Integer idSearch;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stock_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Stock stock;

    @JoinColumn(name = "search_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date searchTimestamp;

    public Search(User u, Stock s, Date d){
        this.setUser(u);
        this.setStock(s);
        this.setSearchTimestamp(d);
    }

}

