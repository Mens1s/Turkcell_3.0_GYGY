package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;


    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        if(categoryDao.findByName(category.getName()) != null){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(category.getName() + " same course name cannot be used!");
            }
            throw new RuntimeException("You cannot add same category name.");
        }

        categoryDao.save(category);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(category.getName() + ".. save operations done successfully!");
        }
    }

    public void delete(int id){
        categoryDao.delete(id);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log("Delete operations done successfully!");
        }
    }

    public void update(Category updatedCategory){
        categoryDao.save(updatedCategory);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.error("Update operations done successfully!");
        }
    }

}
