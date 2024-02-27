package dataAccess;

import dataAccess.JdbcRepositoryImp.JdbcRepository;
import dataAccess.JdbcRepositoryImp.JdbcRepositoryClass;
import entities.Instructor;

import java.util.List;

public class InstructorDao extends JdbcRepositoryClass<Instructor, Integer> {
    //TODO:DELETE this function when all tests done
    public void showDb(){
        this.getDb().forEach(data ->
                System.out.println("Name: " + data.getName()));
    }
}
