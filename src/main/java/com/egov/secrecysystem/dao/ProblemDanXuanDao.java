package com.egov.secrecysystem.dao;

import org.hibernate.Session;

import com.egov.secrecysystem.model.SeProblemPanDuan;




public class ProblemDanXuanDao extends AbstractHibernateDao<SeProblemPanDuan> {
	ProblemDanXuanDao()
	{
		super(SeProblemPanDuan.class);
	}
	
	
	

	
	public Session getSession()
	{
		return this.getCurrentSession();
	}
	
	

					

}