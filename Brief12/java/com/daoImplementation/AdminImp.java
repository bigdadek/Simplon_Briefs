package com.daoImplementation;



import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.DAO;
import com.entities.Admin;
import com.hibernateUtil.HibernateUtil;


public class AdminImp implements DAO<Admin>{
	
	
	
	
	public boolean logIn(String email , String password) 
	{
		Transaction transaction = null;
		Admin admin = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			admin = (Admin) session.createQuery("FROM Admin WHERE email = "+email).uniqueResult();
			
			if(admin != null && admin.getPassword().equals(password)) {
				return true;
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}
	

	@Override
	public List<Admin> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Admin", Admin.class).list();
		}
	}

	@Override
	public Admin getById(long id) {
		Transaction transaction = null;
	 	Admin admin = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			String hql = "FROM Admin WHERE aId = "+ id;
			Query query = session.createQuery(hql);
			admin =  (Admin) query.getResultList().get(0);
			
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return admin;
	}

	@Override
	public boolean add(Admin admin) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(admin);
			transaction.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Admin admin) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "UPDATE Admin set  first_name = :firstName , last_name = :laststName , email = :email , password = :password  " + "WHERE aId = :id";
			Query query = session.createQuery(hql);

			query.setParameter("firstName", admin.getaFName());
			query.setParameter("laststName", admin.getaLName());
			query.setParameter("email", admin.getEmail());
			query.setParameter("password", admin.getPassword());
			query.setParameter("id", admin.getaId());
			query.executeUpdate();

			transaction.commit();
			return true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(long id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "DELETE FROM Admin " + "WHERE aId = " + id;
			Query query = session.createQuery(hql);
			
			query.executeUpdate();
			transaction.commit();
			return true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}


}
