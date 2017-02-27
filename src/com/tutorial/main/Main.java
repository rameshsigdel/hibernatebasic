package com.tutorial.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tutorial.dto.UserDetail;
import com.tutorial.dto.Vehicle;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("CAR");
		
		UserDetail userDetail = new UserDetail();
		userDetail.setAddress("Pokhara");
		userDetail.setDescreption("The Description goes here");
		userDetail.setUserName("Ramesh Sigdel");
		userDetail.setDateOfJoin(new Date());
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(userDetail);
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}
}
