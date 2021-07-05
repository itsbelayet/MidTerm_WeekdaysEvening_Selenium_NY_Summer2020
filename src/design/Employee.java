package design;

public interface Employee {
	
	/* 	Employee is an Interface which contains multiple unimplemented methods.
		Again few methods has been declared in below.
		you need to brainstorm to add more methods to meet the business requirements.
	*/
	//	please read the following method and understand the business requirements of these following methods
	//	and then implement these in a concrete class.
	
	//	employeeId() will return employee id.
	public static int employeeId(){
		int id=0;


		return id;
	}
	
	//	employeeName() will return employee name
	public static String employeeName(){
	String name="";
	return name;
	}
	
	//	assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//	calculate employee salary
	public static int calculateSalary(){
		int salary=0;
		return salary;
	}
	
	//	employee benefit
	public void benefitLayout();

}
