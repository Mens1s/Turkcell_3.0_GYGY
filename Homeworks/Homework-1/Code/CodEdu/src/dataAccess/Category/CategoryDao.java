package dataAccess.Category;

import entities.Category;
// This package not used
// It is for modularity
public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
}
