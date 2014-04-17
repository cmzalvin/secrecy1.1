package com.egov.secrecysystem.controller;

import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.annotation.Autowired;

import com.egov.secrecysystem.dao.ProblemDuoXuanDao;



@RemoteProxy(creator = SpringCreator.class)
public class ProblemDuoXuanController {
	
	@Autowired
	private ProblemDuoXuanDao problemduoxuandao;
	

	
	
	

			
			

}
