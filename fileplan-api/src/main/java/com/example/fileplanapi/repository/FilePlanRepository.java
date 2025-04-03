package com.example.fileplanapi.repository;

import com.example.fileplanapi.model.FilePlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilePlanRepository extends JpaRepository<FilePlan, Long> {}