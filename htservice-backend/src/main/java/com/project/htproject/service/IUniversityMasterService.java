package com.project.htproject.service;
import java.util.List;

import com.project.htproject.entity.UniversityMaster;

public interface IUniversityMasterService {

	List<UniversityMaster> getAllUniversities();
	 UniversityMaster getOneUniversity(Integer universityId);


}