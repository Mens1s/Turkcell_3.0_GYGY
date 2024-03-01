package com.example.kodlamaiodev.services;

import com.example.kodlamaiodev.entities.ProgrammingLanguage;
import com.example.kodlamaiodev.repositories.RepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingLanguageServiceImpl implements ProgramingLanguageService{
    private RepositoryDao<ProgrammingLanguage> programingLanguageDao;

    @Autowired
    public ProgramingLanguageServiceImpl(RepositoryDao<ProgrammingLanguage> programingLanguageDao) {
        this.programingLanguageDao = programingLanguageDao;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        isFieldNull(programmingLanguage.getName());
        isNameExists(programmingLanguage.getName());
        this.programingLanguageDao.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) throws Exception {
        isFieldNull(programmingLanguage.getName());
        isNameExists(programmingLanguage.getName());
        this.programingLanguageDao.update(programmingLanguage);
    }

    @Override
    public void delete(String id) throws Exception {
        isFieldNull(id);
        this.programingLanguageDao.delete(id);
    }

    @Override
    public ProgrammingLanguage getById(String id) throws Exception {
        isFieldNull(id);
        return this.programingLanguageDao.getById(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.programingLanguageDao.getAll();
    }

    private void isNameExists(String name) throws Exception {
        if (this.programingLanguageDao.getByName(name) != null){
            throw new Exception("Language name can not  repeat! Repeated name is " + name);
        }
    }
    private void isFieldNull(String field) throws Exception {
        if( field == null) {
            throw new Exception("Name field can not be null!");
        }
    }

}
