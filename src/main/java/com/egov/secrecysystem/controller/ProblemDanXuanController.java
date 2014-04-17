package com.egov.secrecysystem.controller;

import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.annotation.Autowired;

import com.egov.secrecysystem.dao.ProblemDanXuanDao;



@RemoteProxy(creator = SpringCreator.class)
public class ProblemDanXuanController {
	
	@Autowired
	private ProblemDanXuanDao problemdanxuandao;
	

	
	
	

			
			

}
