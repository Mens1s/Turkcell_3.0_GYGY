package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
}
