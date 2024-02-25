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
    private int idOrder = 1;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = new ArrayList<>();
    }

    public void add(Instructor instructor) throws Exception{
        instructor.setId(idOrder++);

        instructorDao.add(instructor);
        instructors.add(instructor);

        for (Logger logger : loggers) { // polymorphism [db, mail, file]
            logger.log(instructor.getName() + " added to instructors.");
        }
    }

    public void delete(int id){
        // if program uses db
        // instructorDao.findById(id)
        // System.out.println(this.instructors.size());

        // for each based on iteration index if I remove something it will crash
        for(int idx = 0; idx < instructors.size(); idx++){
            if(instructors.get(idx).getId() == id){
                instructorDao.delete(instructors.get(idx));
                this.instructors.remove(instructors.get(idx));

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(instructors.get(idx).getName() + " deleted from instructors.");
                }
            }
        }

        // System.out.println(this.instructors.size());
    }

    public void update(int id, Instructor updatedInstructor){
        // if program uses db
        // instructorDao.findById(id) 
        this.instructors.forEach(instructor -> {
            if(instructor.getId() == id){
                instructorDao.update(instructor);
                this.instructors.set(this.instructors.indexOf(instructor),updatedInstructor);

                for (Logger logger : loggers) { // polymorphism [db, mail, file]
                    logger.log(instructor.getName() + " updated at instructors.");
                }
            }
        });
        // perfectly works as tested. System.out.println(this.instructors.get(0).getName());
    }
}
