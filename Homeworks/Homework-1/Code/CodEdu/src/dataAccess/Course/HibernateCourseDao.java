package dataAccess.Course;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
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
}
