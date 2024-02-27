package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eklendi: " + instructor.getName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile silindi: " + instructor.getName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile güncellendi: " + instructor.getName());
    }
    @Override
    public void add(Course course) {
        System.out.println("Course added with JDBC: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted with JDBC: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with JDBC: " + course.getName());
    }
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile silindi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile güncellendi: " + category.getName());
    }
}
