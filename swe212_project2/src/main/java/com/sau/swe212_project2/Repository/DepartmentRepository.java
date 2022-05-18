package com.sau.swe212_project2.Repository;

import com.sau.swe212_project2.Model.DeptEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DeptEntity, Integer>{}
