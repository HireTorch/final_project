package com.project.htproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.htproject.entity.Company;



@Repository
public interface CompanyRepositoryByLong extends JpaRepository<Company,Long>{
    	

}
