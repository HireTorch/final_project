package com.project.htproject.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	@Query("select a from Admin a where a.adminEmail =:email")
	Admin findByEmail(String email);


	@Query("select a from Admin a where a.adminEmail =:email and a.adminPassword=:encodedPassword")
	Optional<Admin> findOneByEmailAndPassword(String email, String encodedPassword);

}