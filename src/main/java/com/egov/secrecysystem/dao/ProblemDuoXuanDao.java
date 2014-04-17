package com.egov.secrecysystem.dao;

import org.hibernate.Session;

import com.egov.secrecysystem.model.SeProblemPanDuan;




public class ProblemDuoXuanDao extends AbstractHibernateDao<SeProblemPanDuan> {
	ProblemDuoXuanDao()
	{
		super(SeProblemPanDuan.class);
	}
	
	
	

	
	public Session getSession()
	{
		return this.getCurrentSession();
	}
	
	

					

}