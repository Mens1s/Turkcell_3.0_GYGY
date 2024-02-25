package dataAccess.Instructor;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
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
}
