import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.CategoryDao;
import dataAccess.CourseDao;
import dataAccess.InstructorDao;
import dataAccess.JdbcRepositoryImp.JdbcRepositoryClass;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        // Category Field
        CategoryManager categoryManager = new CategoryManager(new CategoryDao(), loggers);

        categoryManager.add(new Category( "backendDevelopment"));
        categoryManager.add(new Category( "frontendDevelopment"));

        // Course Field
        CourseManager courseManager = new CourseManager(new CourseDao(), loggers);

        courseManager.add(new Course( "backendDevelopmentCourse", "Description", 10,1,1,1));
        courseManager.add(new Course( "frontendDevelopmentCourse", "Description", 10,1,1,1));
        courseManager.add(new Course( "frontendDevelopmentCourse", "Description", 10,1,1,1));

        // Instructor Field
        InstructorManager instructorManager = new InstructorManager(new InstructorDao(), loggers);
        instructorManager.add(new Instructor( "Ahmet", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));
        instructorManager.add(new Instructor( "Mens1s", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));
        instructorManager.showDb();
        instructorManager.delete(1);
        instructorManager.showDb();
        Instructor t = new Instructor( "Ahmet", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng");
        t.setId(2);
        instructorManager.update(t);
        instructorManager.showDb();

    }
}