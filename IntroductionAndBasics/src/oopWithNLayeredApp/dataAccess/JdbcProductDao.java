package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        // only db operations here
        System.out.println("Product added!");
    }

    public void delete(Product product) {
        System.out.println("Product deleted!");
    }

    public void update(Product product) {
        System.out.println("Product updated!");
    }

    public void test() {
        System.out.println("Test");
    }
}
