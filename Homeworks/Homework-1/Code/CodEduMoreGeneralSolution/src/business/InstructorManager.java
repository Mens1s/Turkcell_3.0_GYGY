package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception{
        instructorDao.save(instructor);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(instructor.getName() + " added to instructors.");
        }
    }

    public void delete(int id){
        instructorDao.delete(id);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log("Delete operations done successfully!");
        }
    }

    public void update(Instructor updatedInstructor){
        instructorDao.save(updatedInstructor);
        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log("Update operations done successfully!");
        }
    }

    public void showDb(){
        instructorDao.showDb();
    }
}
