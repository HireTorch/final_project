package com.project.htproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.htproject.entity.Address;

public interface AddressRepo extends  JpaRepository<Address,Integer>{

//  @Modifying
//  @Query("insert into Address (gotcandidateId,addressLine1,addressLine2,district,state,countryId,pincode) select :gotcandidateId, :addressLine1, :addressLine2, :district, :state, :countryId, :pincode")
//	void saveOrUpdate(@Param("gotcandidateId") Long gotcandidateId,@Param("addressLine1")  String addressLine1,@Param("addressLine2") String addressLine2, 
//			@Param("district") Integer district,@Param("state") Integer state,
//			@Param("countryId") Integer countryId , @Param("pincode") String pincode);

  /* @Modifying
  @Query("insert into Person (id,name,age) select :id,:name,:age from Dual")
  public int modifyingQueryInsertPerson(@Param("id")Long id, @Param("name")String name, @Param("age")Integer age);*/

}