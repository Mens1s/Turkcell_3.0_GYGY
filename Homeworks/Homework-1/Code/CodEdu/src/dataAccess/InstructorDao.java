package dataAccess;

import entities.Instructor;

public interface InstructorDao {
    void add(Instructor instruction);
    void delete(Instructor instruction);
    void update(Instructor instruction);
}
