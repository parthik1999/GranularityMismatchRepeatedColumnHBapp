package com.parthik.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


@Entity

public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
	private String name;
	private int salary;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="emp_addr",joinColumns = @JoinColumn(name = "emp_empId"))
	private List<Address> addresses = new ArrayList<Address>();
	


	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Employee(int empno, String name, int salary, List<Address> addresses) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses + "]";
	}

		
	
	
	
	
}
