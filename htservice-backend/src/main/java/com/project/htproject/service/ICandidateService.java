package com.project.htproject.service;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Candidate;
import com.project.htproject.response.LoginMessage;


public interface ICandidateService {

    public List<Candidate> getAllCandidate();

	public Candidate addCandidate(CandidateDto candidateDto) throws SerialException;

	public LoginMessage loginCandidate(LoginDto loginDto);

}