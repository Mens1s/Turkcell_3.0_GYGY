package com.example.kodlamaiodev.repositories;

import com.example.kodlamaiodev.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class ProgrammingLanguageDao implements RepositoryDao<ProgrammingLanguage> {
    private Map<String, ProgrammingLanguage> db;
    public ProgrammingLanguageDao(){
        this.db = new HashMap<>();
    }
    @Override
    public void add(ProgrammingLanguage entity) {
        entity.setId(UUID.randomUUID().toString());
        this.db.put(entity.getId(), entity);
    }

    @Override
    public void update(ProgrammingLanguage entity) {
        this.db.put(entity.getId(), entity);
    }

    @Override
    public void delete(String id) {
        this.db.remove(id);
    }

    @Override
    public ProgrammingLanguage getById(String id) {
        return this.db.get(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.db.values().stream().toList();
    }

    public ProgrammingLanguage getByName(String name){
        return this.db.values().stream().filter(programmingLanguage -> isNameMatch(programmingLanguage, name)).findFirst().orElse(null);
    }

    private boolean isNameMatch(ProgrammingLanguage entity, String name) {
        return entity.getName().equals(name);
    }
}
