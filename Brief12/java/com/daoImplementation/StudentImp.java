package com.daoImplementation;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.DAO;
import com.entities.Student;
import com.hibernateUtil.HibernateUtil;



public class StudentImp implements DAO<Student> {

	@Override
	public List<Student> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Students", Student.class).list();
		}
	}

	@Override
	public Student getById(long id) {
		Transaction transaction = null;
		Student student = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "FROM Students WHERE sid ="+id;
			Query query = session.createQuery(hql);
			student = (Student)  query.getResultList().get(0);
			
			
			transaction.commit();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public boolean add(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@ Override
	public boolean update(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "UPDATE Students set class = :class , first_name = :firstName , last_name = :lastName , level = :level " + "WHERE sId = :id";
				Query query = session.createQuery(hql);
			
			query.setParameter("class", student.getsClass());
			query.setParameter("firstName", student.getsFName());
			query.setParameter("lastName", student.getsLName());
			query.setParameter("level", student.getsLevel());
			query.setParameter("id", student.getsId());
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
		
				String hql = "DELETE FROM Students WHERE sId = " + id;
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