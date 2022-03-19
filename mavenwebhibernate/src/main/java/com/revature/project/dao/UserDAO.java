package com.revature.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.project.bean.Users;
import com.revature.project.util.HibernateUtil;

public class UserDAO {
	// Create of CRUD
	public void addUser(Users user) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	// Read of CRUD
	@SuppressWarnings("unchecked")
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<Users>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			users = session.createQuery("from Users").getResultList();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return users;
	}

	// Read of CRUD
	public Users getUserById(int userid) {
		Users user = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hqlQuery = "from Users where id = :id";
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(hqlQuery);
			query.setParameter("id", userid);
			user = (Users) query.getSingleResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return user;
	}

	// Update of CRUD
	public void updateUser(Users user) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	// Delete of CRUD
	public void deleteUser(int userid) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			Users user = (Users) session.load(Users.class, new Integer(userid));
			session.delete(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

}
