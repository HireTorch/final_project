package com.project.htproject.query;

public final class QueryConstant {


	public static final String UPDATE_CANDIDATE = " update Candidate c set c.firstName = :firstName, c.middleName = :middleName,"
			+ " c.lastName = :lastName, c.dob= :dob, c.gender = :gender, c.candidateEmail = :candidateEmail, "
			+ " c.candidateAddhar = :candidateAddhar, c.candidateUserName = :candidateUserName, c.candidatePassword = :candidatePassword  where c.candidateID = :getcandidateId";
   
    public static final String GET_CANDIDATE_ADDRESS = "select a from Address a where a.candidate = :candidateId";
	
    public static final String SELECT_COMPANY_BY_EMAIL = "select c from Company c where c.companyEmail = :email";
    
    public static final String SELECT_COMAPNY_BY_EMAIL_PASSWORD = "select c from Company c where c.companyEmail = :email and c.companyPassword= :encodedPassword";
    
    public static final String SELECT_JOBDETAILS_BY_COMAPANYID = "select j from JobDetails j where j.company =:companyId";
    
    public static final String SELECT_JOBS_BY_SKILLSET = "select j from JobDetails j where j.skillSetRequirement =:skill";
    
    public static final String SELECT_ACADEMICS_BY_CANDIDATEID = "select c from CandidateHscSscAcademics c where c.candidate =:candidateId";
    
    public static final String SELECT_QUALIFICATION_BY_CANDIDATEID = "select c from CandidateQualificationEntity c where c.candidate =:candidateId";
    
    public static final String GET_CANDIDATE_PROJECT = "select p from ProjectEntity p where p.candidate = :candidateId";
    
    public static final String SELECT_PROJECT_BY_CANDIDATEID = "select p from ProjectEntity p where p.candidate =:candidateId";

	public static final String SELECT_EXPERIENCE_BY_CANDIDATEID = "select e from ExperienceEntity e where e.candidate =:candidateId";
    
}