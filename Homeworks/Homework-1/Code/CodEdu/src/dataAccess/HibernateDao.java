package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao <T> implements CategoryDao, CourseDao, InstructorDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile silindi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile güncellendi: " + category.getName());
    }
    @Override
    public void add(Course course) {
        System.out.println("Course added with Hibernate: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted with Hibernate: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with Hibernate: " + course.getName());
    }
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eklendi: " + instructor.getName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile silindi: " + instructor.getName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile güncellendi: " + instructor.getName());
    }
}
