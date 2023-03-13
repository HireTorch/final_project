package com.project.htproject.service;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.project.htproject.dto.AddressDto;
import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.JobDetails;
import com.project.htproject.exception.ServiceException;
import com.project.htproject.repository.CandidateRepository;
import com.project.htproject.repository.CandidateRepositoryForLong;
import com.project.htproject.repository.CandidateRepositoryForUpdate;
import com.project.htproject.repository.JobDetailsRepository;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.response.UpdateResponse;
import java.util.Optional;
import java.util.Set;

import javax.sql.rowset.serial.SerialException;

import java.util.Optional;

@Service
public class CandidateService implements ICandidateService {


	@Autowired
	public CandidateRepository repo;

	@Autowired
	private CandidateRepositoryForLong candidateRepositoryForLong;

	@Autowired
	private PasswordEncoder passwordEncoder;

	//@Autowired
	//private CandidateRepositoryForUpdate candidateRepositoryForUpdate; 
	
	@Autowired
	private JobDetailsRepository jobDetailsRepository ;


	public List<Candidate> getAllCandidate() {
		List<Candidate> allCandidate = repo.findAll();
		return allCandidate;
	}

	@Override
	public Candidate addCandidate(CandidateDto candidateDto) throws SerialException {
		Candidate candidate = null;
		try {
		 candidate = new Candidate(candidateDto.getFirstName(), candidateDto.getMiddleName(),
				candidateDto.getLastName(), candidateDto.getDob(), candidateDto.getGender(),
				candidateDto.getCandidateEmail(), candidateDto.getCandidateAddhar(),
				candidateDto.getCandidateUserName(), this.passwordEncoder.encode(candidateDto.getCandidatePassword()));
		repo.save(candidate);
		}catch (Exception e) {
			throw new SerialException("Candidate Not Saved");
		}
		return candidate;
	    }
	
	
	@SuppressWarnings("null")
	@Override
	public LoginMessage loginCandidate(LoginDto loginDto) {
		String msg=" ";
		Candidate candidate1 = repo.findByEmail(loginDto.getEmail());
		if(candidate1 != null) {
			String password = loginDto.getPassword();
			String encodedPassword = candidate1.getCandidatePassword();
			Boolean isPasswordRight = passwordEncoder.matches(password, encodedPassword);
			if(isPasswordRight) {
				Optional<Candidate> candidate = repo.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
				if(candidate.isPresent()) {
					return new LoginMessage("Login Successful",true,candidate1.getCandidateID());
				} else {
					return new LoginMessage("Login Failed", false);
				}
			} else {
				return new LoginMessage("Password Not Matched ", false);
			}
		} else {
			return new LoginMessage("Email not Exist", false);
		}	
	}

	public Candidate getOneCandidate(Long candidateid) throws ServiceException {
		Candidate candidate = null;
		try {
		Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateid);
		candidate = candidateOpt.get();
		}catch (Exception e) {
			throw new ServiceException("Candidate Not found");
		}
		return candidate;
	}

	public DeleteResponse deleteOneCandidate(Long candidateId) {
		   candidateRepositoryForLong.deleteById(candidateId);
		return new DeleteResponse("deleted Successfully ", candidateId);

	}

	public UpdateResponse updateOneCandidate(CandidateDto candidateDto, Long candidateId) {
		   
				 Long getcandidateId =  candidateId;
				 String firstName = candidateDto.getFirstName();
				 String middleName = candidateDto.getMiddleName();
				 String lastName = candidateDto.getLastName();
				 LocalDate dob = candidateDto.getDob();
				 String gender = candidateDto.getGender();
				String candidateEmail = candidateDto.getCandidateEmail();
				 String candidateAddhar = candidateDto.getCandidateAddhar();
				 String candidateUserName = candidateDto.getCandidateUserName();
				String candidatePassword = candidateDto.getCandidatePassword();
				System.out.println(getcandidateId);
				System.out.println(candidateDto);
				candidateRepositoryForLong.updateCandidate(getcandidateId,firstName, middleName, lastName,
				dob, gender, candidateEmail, candidateAddhar, candidateUserName, candidatePassword);
		         return new UpdateResponse("Updated Succesfully ", candidateDto.getFirstName());
	}


	public String addCandidate(CandidateDto candidateDto, AddressDto address) {
		// TODO Auto-generated method stub
		return null;
	}

	public Candidate appliedJobsOfCandidate(Long cadidateId, Long jobid) {
		Set<JobDetails> jobDetailSet = null;
		Candidate candidate = candidateRepositoryForLong.findById(cadidateId).get();
		JobDetails jobDetails = jobDetailsRepository.findById(jobid).get();
		jobDetailSet = candidate.getAppliedJobDetails();
		jobDetailSet.add(jobDetails);
		candidate.setAppliedJobDetails(jobDetailSet);
		return candidateRepositoryForLong.save(candidate);
	}

}