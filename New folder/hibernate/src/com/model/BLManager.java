package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.pojo.Hiber;

public class BLManager {

	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	
	public void savedata(Hiber hb) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(hb);
		transaction.commit();
		session.close();
	}
	
		public List<Hiber> getallemp()
		{
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Criteria cr=session.createCriteria(Hiber.class);
			List<Hiber> list=cr.list();
			return list;
			
			
		}

		public Hiber serachid(int sid) {
			// TODO Auto-generated method stub
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Criteria cr=session.createCriteria(Hiber.class);
			cr.add(Restrictions.eq("id", sid));
			Hiber h=(Hiber) cr.uniqueResult();
			transaction.commit();
			session.close();
			
			return h;
		}

		public void updateempp(Hiber h) {
			// TODO Auto-generated method stub
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.update(h);
			transaction.commit();
			session.close();
			
		}

		public List<Hiber> getemp() {
			// TODO Auto-generated method stub
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Criteria cr=session.createCriteria(Hiber.class);
			List<Hiber> list=cr.list();
			return list;
		}

		public void deletedata(int sid) {
			// TODO Auto-generated method stub
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Criteria cr=session.createCriteria(Hiber.class);
			cr.add(Restrictions.eq("id", sid));
			Hiber h=(Hiber) cr.uniqueResult();
			session.delete(h);
			transaction.commit();
			session.close();
			
		
		}

}
