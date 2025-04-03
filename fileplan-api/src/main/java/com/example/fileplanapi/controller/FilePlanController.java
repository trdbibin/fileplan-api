package com.example.fileplanapi.controller;

import com.example.fileplanapi.model.FilePlan;
import com.example.fileplanapi.repository.FilePlanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fileplans")
@CrossOrigin(origins = "${fileplan.api.base-url}")
public class FilePlanController {

    private final FilePlanRepository repository;

    public FilePlanController(FilePlanRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<FilePlan> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public FilePlan create(@RequestBody FilePlan filePlan) {
        return repository.save(filePlan);
    }

    @PutMapping("/{id}")
    public FilePlan update(@PathVariable Long id, @RequestBody FilePlan updated) {
        updated.setId(id);
        return repository.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
