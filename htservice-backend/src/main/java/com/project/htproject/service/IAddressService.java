package com.project.htproject.service;
import java.util.List;

import com.project.htproject.entity.Address;
import com.project.htproject.exception.ServiceException;

public interface IAddressService {

	List<Address> getAllAddress() throws ServiceException;

}