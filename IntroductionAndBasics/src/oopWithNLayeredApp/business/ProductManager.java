package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void add(Product product) throws Exception {
        // business rules here
        if(product.getUnitPrice() < 10){
            throw new Exception("Ürün eklenemedi! Ürün fiyatı 10 TL'den az olamaz!");
        }

        productDao.add(product);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(product.getName() + " eklendi!");
        }

        // cast works as expected but do not use do not implement any function as public which is not defined in Interface Product Dao
        // ((JdbcProductDao)productDao).test();
    }
}
