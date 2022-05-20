package com.sau.swe212_project3.Security;

import com.sau.swe212_project3.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    Optional<UserEntity> findByUserName(String userName);}
