package com.mkyong.stock.bo;

import com.mkyong.stock.model.Stock;

/**
 * Created by Ashot Karakhanyan on 21-09-2014
 */
public interface StockBo {

    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}