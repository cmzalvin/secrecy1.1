package com.egov.secrecysystem.dao;

import org.hibernate.Session;

import com.egov.secrecysystem.model.SeProblemPanDuan;




public class ProblemPanDuanDao extends AbstractHibernateDao<SeProblemPanDuan> {
	ProblemPanDuanDao()
	{
		super(SeProblemPanDuan.class);
	}
	
	
	

	
	public Session getSession()
	{
		return this.getCurrentSession();
	}
	
	

					

}