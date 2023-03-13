package com.project.htproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.htproject.entity.BoardsMaster;

public interface BoardsMasterRepo extends JpaRepository<BoardsMaster, Integer> {

}