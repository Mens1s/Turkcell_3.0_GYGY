package com.example.kodlamaiodev.repositories;

import com.example.kodlamaiodev.entities.BaseEntity;
import com.example.kodlamaiodev.entities.ProgrammingLanguage;

import java.util.List;

public interface RepositoryDao <T extends BaseEntity> {
    void add(T entity);
    void update(T entity);
    void delete(String id);
    T getById(String id);
    List<T> getAll();
    public T getByName(String name);
}
