package com.mkyong.stock.bo.impl;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;
import com.mkyong.stock.dao.StockDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ashot Karakhanyan on 21-09-2014
 */

@Service
@Transactional(readOnly = false)
public class StockBoImpl implements StockBo {

    StockDao stockDao;

    @Transactional(readOnly = true)
    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void save(Stock stock) {
        stockDao.save(stock);
    }

    public void update(Stock stock) {
        stockDao.update(stock);
    }

    public void delete(Stock stock) {
        stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        return stockDao.findByStockCode(stockCode);
    }
}