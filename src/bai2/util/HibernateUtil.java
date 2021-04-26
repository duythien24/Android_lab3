package bai2.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import bai2.model.Register;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			StandardServiceRegistry registry=new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml")
					.build();
			Metadata meta=new MetadataSources(registry)
					.addAnnotatedClass(Register.class)
					.getMetadataBuilder()
					.build();
			sessionFactory=meta.getSessionFactoryBuilder()
					.build();
		} catch (Throwable e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
