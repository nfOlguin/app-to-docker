package com.ejercicio.javamysqldocker.repository;

import com.ejercicio.javamysqldocker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
