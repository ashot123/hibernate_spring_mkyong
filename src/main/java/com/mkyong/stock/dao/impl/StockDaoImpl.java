package com.mkyong.stock.dao.impl;

import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Ashot Karakhanyan on 21-09-2014
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find(
                "from Stock where stockCode=?", stockCode
        );
        return (Stock) list.get(0);
    }

}