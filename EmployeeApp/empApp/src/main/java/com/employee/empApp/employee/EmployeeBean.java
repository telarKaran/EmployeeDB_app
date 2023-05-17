package com.employee.empApp.employee;

public class EmployeeBean {

	private String id;
	private String name;
	private String salary;


	public EmployeeBean(String id, String name, String salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
//	public nameBean() {
//		this.setSurname("Telar");
//		this.name =new String[]{"asvds","b"};
//		// TODO Auto-generated constructor stub
//	}
//	public String getSurname() {
//		return surname;
//	}
//
//	public void setSurname(String surname) {
//		this.surname = surname;
//	}
//	public String[] getName() {
//		return name;
//	}
//
//	public void setName(String[] name2) {
//		this.name = name2;
//	}
//
//	@Override
//	public String toString() {
//		return "nameBean [surname=" + surname +  "]";
//	}
}
