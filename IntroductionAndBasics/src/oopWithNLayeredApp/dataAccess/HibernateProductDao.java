package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi: " + product.getName());
    }
    public void update(Product product) {
        System.out.println("Hibernate ile güncellendi: " + product.getName());
    }
    public void delete(Product product) {
        System.out.println("Hibernate ile silindi: " + product.getName());
    }
}
