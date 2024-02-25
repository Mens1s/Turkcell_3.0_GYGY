package dataAccess.Category;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile silindi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile güncellendi: " + category.getName());
    }
}
