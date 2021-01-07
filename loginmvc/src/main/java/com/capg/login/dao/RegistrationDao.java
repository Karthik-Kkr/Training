package com.capg.login.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.login.model.Register;

@Repository
public class RegistrationDao {
	
	Map<Integer, Register> registers=new HashMap<Integer, Register>();
	
	public Register newRegisters(Register r) {
		registers.put(r.getUserId(), r);
		return r;
	}
	
}
