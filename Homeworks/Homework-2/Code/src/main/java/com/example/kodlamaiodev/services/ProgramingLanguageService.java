package com.example.kodlamaiodev.services;

import com.example.kodlamaiodev.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(String id) throws Exception;
    ProgrammingLanguage getById(String id) throws Exception;
    List<ProgrammingLanguage> getAll();
}
