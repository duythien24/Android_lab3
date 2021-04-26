package bai2.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bai2.model.Register;
import bai2.util.HibernateUtil;

public class RegisterDao {
	public void saveRegister(Register register) {
		Transaction tr=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			tr=session.beginTransaction();
			session.save(register);
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public List<Register> getAllRegister(){
		Transaction tr=null;
		List<Register> listRegiter=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			tr=session.beginTransaction();
			listRegiter=session.createQuery("from Register")
					.getResultList();
			tr.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return listRegiter;
		
	}
}
