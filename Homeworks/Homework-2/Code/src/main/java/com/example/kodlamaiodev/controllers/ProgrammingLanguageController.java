package com.example.kodlamaiodev.controllers;

import com.example.kodlamaiodev.entities.ProgrammingLanguage;
import com.example.kodlamaiodev.services.ProgramingLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {
    private ProgramingLanguageService programingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    @PostMapping
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        this.programingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id) throws Exception {
        this.programingLanguageService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        this.programingLanguageService.update(programmingLanguage);
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getById(@PathVariable("id") String id) throws Exception {
        return this.programingLanguageService.getById(id);
    }

    @GetMapping
    public List<ProgrammingLanguage> getAll(){
        return this.programingLanguageService.getAll();
    }
}
