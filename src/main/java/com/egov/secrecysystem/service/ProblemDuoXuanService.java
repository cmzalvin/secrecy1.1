package com.egov.secrecysystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.egov.secrecysystem.dao.ProblemDuoXuanDao;



@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ProblemDuoXuanService {
	

	@Autowired
	private ProblemDuoXuanDao problemduoxuandao;
	


	
	

}
	
