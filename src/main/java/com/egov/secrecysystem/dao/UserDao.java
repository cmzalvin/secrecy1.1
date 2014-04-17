package com.egov.secrecysystem.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.egov.secrecysystem.model.SeUser;

public class UserDao extends AbstractHibernateDao<SeUser> {

	UserDao() {
		super(SeUser.class);
	}

	public String validateLogin(String name, String password) {
		String hql = "select e from com.egov.secrecysystem.model.SeUser e where e.loginname=:Name and e.password=:Password";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setParameter("Name", name);
		query.setParameter("Password", password);
		List<SeUser> result = query.list();
		if (result.size() != 1)
			return null;
		else
			return "ok";
	}

	public SeUser getRoleByLoginName(String loginName) {
		String hql = "select e from com.egov.secrecysystem.model.SeUser e where e.loginname=:loginName";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setParameter("loginName", loginName);
		List<SeUser> result = query.list();
		if (result.size() == 1)
			return result.get(0);
		return null;
	}

	public Integer getRoleLevelByLoginName(String loginName) {
		String hql = "select e.userlevel from com.egov.secrecysystem.model.SeUser e where e.loginname=:loginName";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setParameter("loginName", loginName);
		List<String> result = query.list();
		if (result.size() == 1)
			return Integer.parseInt(result.get(0));
		return -1;
	}

	public List<Map> getPageInstructors(String whereString,
			Map<String, Object> valuesMap, int pageNum, int pageSize) {
System.out.println("******************************************************************************************************************");
		String hql = "select new map(t.id as id, t.name as name, t.loginname as loginname, t.password as password,"+
				"  t.userlevel as userlevel, t.score as score) from com.egov.secrecysystem.model.SeUser t";
		hql += whereString;
		hql +=" order by t.id ";
		Query query = this.getCurrentSession().createQuery(hql).setFirstResult(pageNum).setMaxResults(pageSize);
System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		String[] perchs = valuesMap.keySet().toArray(new String[0]);
		for (int i = 0; i < perchs.length; i++) {
			query.setParameter(perchs[i], valuesMap.get(perchs[i]));
		}
		return query.list();
	}

	public long getInstructorsTotalCount(String whereString,
			Map<String, Object> valuesMap) {
		String hql = "select t from com.egov.secrecysystem.model.SeUser t ";
		hql += whereString;
		hql += " and t is not null";
		Query query = this.getCurrentSession().createQuery(hql);
		String[] perchs = valuesMap.keySet().toArray(new String[0]);
		for (int i = 0; i < perchs.length; i++) {
			query.setParameter(perchs[i], valuesMap.get(perchs[i]));
		}
		return query.list().size();
	}
	public Session getSession(){
		return this.getCurrentSession();
	}

}
