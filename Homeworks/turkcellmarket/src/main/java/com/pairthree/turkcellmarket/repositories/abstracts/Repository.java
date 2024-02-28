package com.pairthree.turkcellmarket.repositories.abstracts;

import com.pairthree.turkcellmarket.entities.BaseEntity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


public abstract class Repository <T extends BaseEntity> {

    private Map<String, T> db;

    public Repository(){
        this.db = new HashMap<>();
    }

    public void add(T entity){
        entity.setId(UUID.randomUUID().toString());
        db.put(entity.getId(), entity);
    }
    public void get(String id){
        db.get(id);
    }
    public void update(T entity){
        db.put(entity.getId(), entity);
    }
    public void delete(String id){
        db.remove(id);
    }
    public List<T> getAll(){
        return db.values().stream().toList();
    }


}
