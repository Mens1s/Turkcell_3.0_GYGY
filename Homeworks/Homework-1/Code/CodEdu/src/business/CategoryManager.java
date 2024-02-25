package business;

import core.logging.Logger;
import dataAccess.Category.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;
    private List<Category> categories;
    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = new ArrayList<>();
    }

    public void add(Category category) throws Exception{
        // if program uses db
        // categoryDao.findByName(category.getName()) != null
        // throw exception
        // we do not use db so CategoryManager holds as list
        this.categories.forEach(tempCategory -> {
            if(tempCategory.getName().equals(category.getName())){
                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.error(category.getName() + " does not added because same name cannot be used.");
                }
                throw new RuntimeException("You cannot add same category name.");
            }
        });

        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(category.getName() + " added to categories.");
        }
    }

    public void delete(int id){
        // if program uses db
        // categoryDao.findById(id)
        this.categories.forEach(category -> {
            if(category.getId() == id){
                categoryDao.delete(category);
                this.categories.remove(category);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(category.getName() + " deleted from categories.");
                }
            }
        });


    }

    public void update(int id){
        // if program uses db
        // categoryDao.findById(id)
        this.categories.forEach(category -> {
            if(category.getId() == id){
                categoryDao.update(category);
                this.categories.set(this.categories.indexOf(category),category);
                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(category.getName() + " updated at categories.");
                }
            }
        });
    }
}
