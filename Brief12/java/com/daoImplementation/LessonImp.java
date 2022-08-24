package com.daoImplementation;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.DAO;
import com.entities.Lesson;
import com.entities.Student;
import com.hibernateUtil.HibernateUtil;

public class LessonImp implements DAO<Lesson> {

	@Override
	public List<Lesson> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from LessonS", Lesson.class).list();
		}
	}

	@Override
	public Lesson getById(long id) {
		Transaction transaction = null;
		Lesson lesson = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "FROM Lessons WHERE lId ="+id;
			Query query = session.createQuery(hql);
			lesson = (Lesson)  query.getResultList().get(0);
			
			
			transaction.commit();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return lesson;
	}

	@Override
	public boolean add(Lesson lesson) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(lesson);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Lesson lesson) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			String hql = "UPDATE Students set  level = :level  ,Subject = :subject , Title = :title , lesson = :lesson " + "WHERE lId = :id";
				Query query = session.createQuery(hql);
			
			query.setParameter("level", lesson.getLevel());
			query.setParameter("subject", lesson.getlSubject());
			query.setParameter("title", lesson.getlTitle());
			query.setParameter("lesson", lesson.getLesson());
			query.setParameter("id", lesson.getlId());
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
		
				String hql = "DELETE FROM Lessons WHERE lId = " + id;
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
