package dataAccess.Instructor;

import entities.Instructor;
// This package not used
// It is for modularity
public interface InstructorDao {
    void add(Instructor instruction);
    void delete(Instructor instruction);
    void update(Instructor instruction);
}
