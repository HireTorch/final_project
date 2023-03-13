package com.project.htproject.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.UniversityMaster;
import com.project.htproject.repository.UniversityMasterRespository;

@Service
public class UniversityMasterService implements IUniversityMasterService {

	@Autowired
	public UniversityMasterRespository universityRepo;

	@Override
	public List<UniversityMaster> getAllUniversities() {
		List<UniversityMaster> universities = universityRepo.findAll();
		return universities;
	}

//	public List<UniversityMaster> getAllUniversities() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public UniversityMaster getOneUniversity(Integer universityId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public UniversityMaster getOneUniversity(Integer universityId) {
		Optional<UniversityMaster> universityOpt = universityRepo.findById(universityId);
		UniversityMaster university = universityOpt.get();
		return university;
	}


}