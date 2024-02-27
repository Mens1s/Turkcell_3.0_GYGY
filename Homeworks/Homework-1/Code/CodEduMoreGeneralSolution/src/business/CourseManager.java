package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;


    public CourseManager(CourseDao courseDao, List<Logger> loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {
        if(courseDao.findByName(course.getName()) != null){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(course.getName() + " same course name cannot be used!");
            }
            throw new RuntimeException("You cannot add same course name.");
        }

        if(course.getPrice() < 0){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(course.getName() + " does not added because of price under 0.");
            }
            throw new RuntimeException("The price cannot be under 0.");
        }


        courseDao.save(course);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(course.getName() + " added to courses.");
        }
    }

    public void delete(int id){
        courseDao.delete(id);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log("Delete operations done successfully!");
        }
    }

    public void update(Course updatedCourse){
        courseDao.save(updatedCourse);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log("Update operations done successfully!");
        }
    }
}
