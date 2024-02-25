import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.Category.CategoryDao;
import dataAccess.Category.HibernateCategoryDao;
import dataAccess.Category.JdbcCategoryDao;
import dataAccess.Course.CourseDao;
import dataAccess.Course.HibernateCourseDao;
import dataAccess.Course.JdbcCourseDao;
import dataAccess.Instructor.HibernateInstructorDao;
import dataAccess.Instructor.InstructorDao;
import dataAccess.Instructor.JdbcInstructorDao;
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

        // Category field
        CategoryDao hibCategoryDao = new HibernateCategoryDao();
        CategoryDao jdbcCategoryDao = new JdbcCategoryDao();

        CategoryManager hibCategoryManager = new CategoryManager(hibCategoryDao, loggers);
        CategoryManager jdbcCategoryManager = new CategoryManager(jdbcCategoryDao, loggers);

        hibCategoryManager.add(new Category( "backendDevelopment"));
        hibCategoryManager.add(new Category( "frontendDevelopment"));
        // hibCategoryManager.add(new Category(1, "backendDevelopment")); // error

        jdbcCategoryManager.add(new Category( "backendDevelopment"));
        jdbcCategoryManager.add(new Category( "frontendDevelopment"));
        // jdbcCategoryManager.add(new Category(1, "backendDevelopment")); // error

        // Course Field
        CourseDao hibCourseDao = new HibernateCourseDao();
        CourseDao jdbcCourseDao = new JdbcCourseDao();

        CourseManager hibCourseManager = new CourseManager(hibCourseDao, loggers);
        CourseManager jdbcCourseManager = new CourseManager(jdbcCourseDao, loggers);

        hibCourseManager.add(new Course( "backendDevelopmentCourse", "Description", 10,1,1,1));
        hibCourseManager.add(new Course( "frontendDevelopmentCourse", "Description", 10,1,1,1));
        // hibCourseManager.add(new Course(1, "frontendDevelopmentCourse", "Description", 10,1,1,1));  // error
        // hibCourseManager.add(new Course(1, "frontendDevelopmentCourse", "Description", 10,1,1,-1)); // error

        jdbcCourseManager.add(new Course( "backendDevelopmentCourse", "Description", 10,1,1,1));
        jdbcCourseManager.add(new Course( "frontendDevelopmentCourse", "Description", 10,1,1,1));
        // jdbcCourseManager.add(new Course(1, "frontendDevelopmentCourse", "Description", 10,1,1,1));  // error
        // jdbcCourseManager.add(new Course(1, "frontendDevelopmentCourse", "Description", 10,1,1,-1)); // error

        // Instructor Field
        InstructorDao hibInstructorDao = new HibernateInstructorDao();
        InstructorDao jdbcInstructorDao = new JdbcInstructorDao();

        InstructorManager hibInstructorManager = new InstructorManager(hibInstructorDao, loggers);
        InstructorManager jdbcInstructorManager = new InstructorManager(jdbcInstructorDao, loggers);

        hibInstructorManager.add(new Instructor( "Ahmet", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));
        hibInstructorManager.add(new Instructor( "Mens1s", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));

        jdbcInstructorManager.add(new Instructor("Yiğit", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));
        jdbcInstructorManager.add(new Instructor( "Mensis", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));

        jdbcInstructorManager.update(1, new Instructor( "UpdatedData", "Yiğit", "ahmet_yigit_02@hotmail.com", "545", "SoftwareEng"));
        jdbcInstructorManager.delete(0);
        jdbcInstructorManager.delete(1);

        jdbcCategoryManager.delete(1);
        // jdbcCategoryManager.update(0, new Category( "frontendDevelopment")); // error same course name
    }
}