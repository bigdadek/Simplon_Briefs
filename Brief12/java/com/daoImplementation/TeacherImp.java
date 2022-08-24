package com.daoImplementation;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.DAO;
import com.entities.Teacher;
import com.hibernateUtil.HibernateUtil;

public class TeacherImp implements DAO<Teacher> {

	@Override
	public List<Teacher> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Teachers", Teacher.class).list();
		}
	}

	@Override
	public Teacher getById(long id) {
		Transaction transaction = null;
		Teacher teacher = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "FROM Students WHERE tId ="+id;
			Query query = session.createQuery(hql);
			teacher = (Teacher)  query.getResultList().get(0);
			
			
			transaction.commit();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return teacher;
	}

	@Override
	public boolean add(Teacher teacher) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(teacher);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Teacher teacher) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "UPDATE Students set first_name = :firstName , last_name = :lastName , level = :level " + "WHERE tId = :id";
				Query query = session.createQuery(hql);

			query.setParameter("firstName", teacher.gettFName());
			query.setParameter("lastName", teacher.gettLName());
			query.setParameter("level", teacher.getlevel());
			query.setParameter("id", teacher.gettId());
			query.executeUpdate();

			transaction.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(long id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
		
				String hql = "DELETE FROM Teachers WHERE tId = " + id;
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
