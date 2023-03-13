package com.project.htproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.htproject.entity.Candidate;
import com.project.htproject.response.UpdateResponse;

public interface CandidateRepositoryForUpdate extends JpaRepository<Candidate, UpdateResponse> {

//	@jakarta.transaction.Transactional //Causes to start the transaction when the execution begins and end when it ends
//	@Modifying //Mandatory in order to support any DML operation
//	@Query("update Candidate c set c.firstName = :firstName, c.middleName = :middleName, c.lastName = :lastName, c.dob= :dob, c.gender = :gender, c.candidateEmail = :candidateEmail, "
//			+ "c.candidateAddhar = :candidateAddhar, c.candidateUserName = :candidateUserName, c.candidatePassword = :candidatePassword  where c.candidateId = :candidateId")
//	void updateCandidate(Long candidateID, String firstName, String middleName, String lastName, LocalDate dob,
//			String gender, String candidateEmail, String candidateAddhar, String candidateUserName,
//			String candidatePassword);

}