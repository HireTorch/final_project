package com.project.htproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.Company;
import com.project.htproject.query.QueryConstant;


public interface CompanyRepository extends JpaRepository<Company, String> {

	@Query(QueryConstant.SELECT_COMPANY_BY_EMAIL)
	Company findByEmail(String email);
    

	@Query(QueryConstant.SELECT_COMAPNY_BY_EMAIL_PASSWORD)
	Optional<Company> findOneByEmailAndPassword(String email, String encodedPassword);


}
