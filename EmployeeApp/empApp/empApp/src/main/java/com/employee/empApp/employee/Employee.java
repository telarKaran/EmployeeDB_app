
package com.employee.empApp.employee;

public class Employee {
  private Long id;
  private String name;
  private String salary;

  public Employee() {}

  public Employee(Long id, String name, String salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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



}

//package com.employee.empApp.employee;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//public class Employee {
//
//	private String name[]={"13","karan","2000"};
//	
////	@RequestMapping(method=RequestMethod.GET, path = "/")
////	public String[] name() {
////		return name;
////	}
//	
//	@GetMapping( path = "/")
//	public String[] name() {
//		return name;
//	}
//	@GetMapping( path = "/json")
//	public EmployeeBean EmployeeBean() {
//		return new EmployeeBean("424","Karan","32545634");
//	}
//}
