package business;

import core.logging.Logger;
import dataAccess.Instructor.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Logger> loggers;
    private List<Instructor> instructors;
    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = new ArrayList<>();
    }

    public void add(Instructor instructor) throws Exception{

        instructorDao.add(instructor);
        instructors.add(instructor);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(instructor.getName() + " added to instructors.");
        }
    }

    public void delete(int id){
        // if program uses db
        // instructorDao.findById(id) 
        this.instructors.forEach(instructor -> {
            if(instructor.getId() == id){
                instructorDao.delete(instructor);
                this.instructors.remove(instructor);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(instructor.getName() + " deleted from instructors.");
                }
            }
        });
    }

    public void update(int id){
        // if program uses db
        // instructorDao.findById(id) 
        this.instructors.forEach(instructor -> {
            if(instructor.getId() == id){
                instructorDao.update(instructor);
                this.instructors.set(this.instructors.indexOf(instructor),instructor);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(instructor.getName() + " updated at instructors.");
                }
            }
        });
    }
}
