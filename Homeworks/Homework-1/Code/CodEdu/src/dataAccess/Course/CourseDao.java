package dataAccess.Course;

import entities.Course;
// This package not used
// It is for modularity
public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    void update(Course course);
}
