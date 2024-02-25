package dataAccess.Instructor;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
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
