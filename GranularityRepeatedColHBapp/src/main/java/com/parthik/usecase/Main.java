package com.parthik.usecase;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.parthik.beans.Address;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		//for retriving by id
		Employee emp = ses.get(Employee.class, 1);
		System.out.println(emp.getName());
		List<Address> list = emp.getAddresses();
		list.forEach(ad->{
			System.out.println(ad);
		});
//================================================================================//		
		//for retriving by name 
//		Query q	= ses.createQuery("select addr from Employee where name=:name");
//		q.setParameter("name", "Parthik");
//		List<Address> list= q.getResultList();
//		Address add = list.get(0);
//		System.out.println(add.getCity());
		
//================================================================================//		
		//store value

//		Employee emp = new Employee();
//		emp.setName("Parthik");
//		emp.setSalary(10800);
//		
//		Address homAddress = new Address("Talod", "Gujarat", "383215");
//		Address ofAddress = new Address("Pune","Pune","856325");
//		
//		Address currentAddress = new Address("Gandhinagar","Gandhinagar","382015");
//		
//		emp.getAddresses().add(homAddress);
//		emp.getAddresses().add(ofAddress);
//		emp.getAddresses().add(currentAddress);
//		
//		
//		ses.getTransaction().begin();
//		
//		ses.save(emp);
//		
//		ses.getTransaction().commit();
//		
		System.out.println("done");
	}
	
}
