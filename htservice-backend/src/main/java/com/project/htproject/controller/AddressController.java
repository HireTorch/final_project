package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.AddressDto;
import com.project.htproject.entity.Address;
import com.project.htproject.exception.ServiceException;
import com.project.htproject.service.AddressService;
@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/candidate/address/")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@GetMapping("/all")
	public ResponseEntity<Object> getAllcandidate() {
		List<Address> allAddress = null;
		try {
			allAddress = addressService.getAllAddress();
			return new ResponseEntity<>(allAddress, HttpStatus.OK);
		} catch (ServiceException e) {
			return new ResponseEntity<>(e, HttpStatus.NOT_FOUND );
		}
	}
	
	
	
	@PostMapping("save/{candidate_Id}")
	private ResponseEntity<Object> saveAddresss(@RequestBody AddressDto addressDto , @PathVariable("candidate_Id")Long candidateId)
	{   
		Address address = null;
		try {
		address = addressService.addAddress(addressDto, candidateId);
		return new ResponseEntity<> (address , HttpStatus.OK);
		}catch (ServiceException e) {
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
		
	}
	//--------------------------------------------------------------------------------

//	@PostMapping("/save/{candidate_Id}")
//	public String saveAddress(@RequestBody AddressDto addressDto , @PathVariable("candidate_Id") Long candidateId)  {
//		String id = addressService.addAddress(addressDto , candidateId );
//		return id;
//	}

}