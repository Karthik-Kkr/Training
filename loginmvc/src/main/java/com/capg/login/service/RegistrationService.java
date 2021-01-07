package com.capg.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.login.dao.RegistrationDao;
import com.capg.login.model.Register;

@Service
public class RegistrationService implements IRegistrationService{
	
	@Autowired
	RegistrationDao dao;
	
	public Register newRegistry(Register r) {
		return dao.newRegisters(r);
	}
}
