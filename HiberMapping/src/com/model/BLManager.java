package com.model;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Role;
import com.pojo.Student;

public class BLManager {

	SessionFactory factory = new Configuration().configure()
			.buildSessionFactory();

	public Role searchdata(String rolename) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Role.class);
		cr.add(Restrictions.eq("rolename", rolename));
		Role r = (Role) cr.uniqueResult();
		return r;

	}

	public void savedata(Student t) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(t);
		transaction.commit();
		session.close();

	}

	public Student checkdata(String email, String password) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Criteria cr=session.createCriteria(Student.class);
		cr.add(Restrictions.eq("email",email));
		cr.add(Restrictions.eq("password",password));
		Student s=(Student) cr.uniqueResult();
		return s;
		
	}

	public int getdata(String email) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Criteria cr=session.createCriteria(Student.class);
		cr.add(Restrictions.eq("email",email));
		 List<Student> s=cr.list();
		ListIterator<Student> itr=s.listIterator();
		int i=0;
		while(itr.hasNext())
		{
			i++;
			System.out.println(itr.next());
		}
		
		
		return i;
		
		
		
		
	}

}
