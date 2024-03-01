package com.example.kodlamaiodev.entities;

public class ProgrammingLanguage extends BaseEntity{
    private String name;

    public ProgrammingLanguage(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
