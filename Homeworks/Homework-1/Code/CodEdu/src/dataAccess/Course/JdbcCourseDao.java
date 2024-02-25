package dataAccess.Course;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
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
}
