package com.sau.swe212_project3.Repository;

import com.sau.swe212_project3.Model.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmpEntity, Integer>{}