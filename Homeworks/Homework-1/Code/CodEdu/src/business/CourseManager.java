package business;

import core.logging.Logger;
import dataAccess.Course.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;
    private List<Course> courses;
    public CourseManager(CourseDao courseDao, List<Logger> loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = new ArrayList<>();
    }

    public void add(Course course) throws Exception{
        // if program uses db
        // CourseDao.findByName(Course.getName()) != null
        // throw exception
        // we do not use db so CourseManager holds as list
        if(course.getPrice() < 0){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(course.getName() + " does not added because of price under 0.");
            }
            throw new RuntimeException("The price cannot be under 0.");
        }

        this.courses.forEach(tempCourse -> {
            if(tempCourse.getName().equals(course.getName())){
                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.error(course.getName() + " does not added because same name cannot be used.");
                }
                throw new RuntimeException("You cannot add same Course name.");
            }
        });

        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(course.getName() + " added to courses.");
        }
    }

    public void delete(int id){
        // if program uses db
        // CourseDao.findById(id) 
        this.courses.forEach(course -> {
            if(course.getId() == id){
                courseDao.delete(course);
                this.courses.remove(course);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(course.getName() + " deleted from courses.");
                }
            }
        });
    }

    public void update(int id){
        // if program uses db
        // CourseDao.findById(id) 
        this.courses.forEach(course -> {
            if(course.getId() == id){
                courseDao.update(course);
                this.courses.set(this.courses.indexOf(course),course);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(course.getName() + " updated at courses.");
                }
            }
        });
    }
}
