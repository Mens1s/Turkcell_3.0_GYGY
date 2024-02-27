package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Laptop", 5000);
        Product product2 = new Product(2, "Mouse", 9);

        List<Logger> loggers = List.of(new DatabaseLogger(), new MailLogger(), new FileLogger());
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);

        productManager.add(product1);
        productManager.add(product2); // exception

    }
}