package com.project.htproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.htproject.entity.Admin;

public interface AdminRepositoryForInt extends JpaRepository<Admin, Integer> {

}