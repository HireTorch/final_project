package com.project.htproject.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.AddressDto;
import com.project.htproject.entity.Address;
import com.project.htproject.entity.Candidate;
import com.project.htproject.exception.ServiceException;
import com.project.htproject.repository.AddressRepo;
import com.project.htproject.repository.CandidateRepositoryForLong;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private AddressRepo repository;
	
	@Autowired
	private CandidateRepositoryForLong candidateRepositoryForLong;
	
	@Autowired
	private ModelMapper mapper;
	
	

		@Override
		public List<Address> getAllAddress() throws ServiceException {
			List<Address> allAddress = new ArrayList<>();
			try {
				allAddress = repository.findAll();
			} catch (Exception e) {
				throw new ServiceException("Address not found!");
			}
			return allAddress;
		}
		
		
		public Address addAddress(AddressDto addressDto, Long candidateId) throws ServiceException {
			Address address = null;
			try {
			Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateId);
			Candidate candidate = candidateOpt.get();
			System.out.println(candidate);
			addressDto.setCandidateId(candidate);
			address = this.mapper.map(addressDto,Address.class);
			System.out.println(address);
	        repository.save(address);
			}catch(Exception e) {
				throw new ServiceException("Address not inserted SuccessFully");
			}
			return address;
		}
		
}