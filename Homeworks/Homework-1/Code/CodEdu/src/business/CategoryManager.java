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
    private int idOrder = 1;
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
        // in normal situation we do not get id from user
        // category.setId(this.categories.size()+1); has to be unique
        category.setId(idOrder++);

        if(checkDuplicateName(category.getName())){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(category.getName() + " does not added because same name cannot be used.");
            }
            throw new RuntimeException("You cannot add same category name.");
        }

        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(category.getName() + " added to categories.");
        }
    }

    public void delete(int id){
        // if program uses db
        // categoryDao.findById(id)
        for(int idx = 0; idx < categories.size(); idx++){
            if(categories.get(idx).getId() == id){
                categoryDao.delete(categories.get(idx));
                this.categories.remove(categories.get(idx));

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(categories.get(idx).getName() + " deleted from instructors.");
                }
            }
        }


    }

    public void update(int id, Category updatedCategory){
        // if program uses db
        // categoryDao.findById(id)
        if(checkDuplicateName(updatedCategory.getName())){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(updatedCategory.getName() + " does not updated because same name cannot be used.");
            }
            throw new RuntimeException("You cannot updated same category name.");
        }
        this.categories.forEach(category -> {
            if(category.getId() == id){
                categoryDao.update(category);
                this.categories.set(this.categories.indexOf(category), updatedCategory);
                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(category.getName() + " updated at categories.");
                }
            }
        });
    }

    private boolean checkDuplicateName(String name){
        return this.categories.stream()
                .anyMatch(tempCategory -> tempCategory.getName().equals(name));
    }
}
