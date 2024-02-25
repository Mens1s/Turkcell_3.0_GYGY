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
    private int idOrder = 1;

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
        // course.setId(this.courses.size()+1); and it has to be unique
        course.setId(idOrder++);

        if(course.getPrice() < 0){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(course.getName() + " does not added because of price under 0.");
            }
            throw new RuntimeException("The price cannot be under 0.");
        }

        if(checkDuplicateName(course.getName())){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(course.getName() + " does not added because same name cannot be used.");
            }
            throw new RuntimeException("You cannot add same course name.");
        }

        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(course.getName() + " added to courses.");
        }
    }

    public void delete(int id){
        // if program uses db
        // CourseDao.findById(id) 
        // for each based on iteration index if I remove something it will crash
        for(int idx = 0; idx < courses.size(); idx++){
            if(courses.get(idx).getId() == id){
                courseDao.delete(courses.get(idx));
                this.courses.remove(courses.get(idx));

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(courses.get(idx).getName() + " deleted from instructors.");
                }
            }
        }
    }

    public void update(int id, Course updatedCourse){
        // if program uses db
        // CourseDao.findById(id)
        if(checkDuplicateName(updatedCourse.getName())){
            for (Logger logger : loggers) { // polymorphism [db, mail, file]
                logger.error(updatedCourse.getName() + " does not updated because same name cannot be used.");
            }
            throw new RuntimeException("You cannot updated same course name.");
        }

        this.courses.forEach(course -> {
            if(course.getId() == id){
                courseDao.update(course);
                this.courses.set(this.courses.indexOf(course),updatedCourse);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(course.getName() + " updated at courses.");
                }
            }
        });
    }

    private boolean checkDuplicateName(String name){
        return this.courses.stream()
                .anyMatch(tempCourse -> tempCourse.getName().equals(name));
    }
}
