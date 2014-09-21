package com.mkyong.stock.model;

import javax.persistence.*;

/**
 * Created by Ashot Karakhanyan on 21-09-2014
 */

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STOCK_ID")
    private Long stockId;

    @Column(name = "STOCK_CODE", length = 10, unique = true, nullable = false)
    private String stockCode;

    @Column(name = "STOCK_NAME", length = 20, unique = true, nullable = false )
    private String stockName;

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
