package harsha;

public class Employee {
   private int empid;
   private String ename;
   private float salary;

    
   public Employee() {
	   
   }
  
   public Employee(int empId, String empName, float salary){   
	   super();
	   this.empid = empId;
	   this.ename = empName;
	   this.salary = salary;
   }

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}




public static void main(String[] args) throws Exception {
	Employee emp=new Employee(10110,"raju",60);
	EmployeeAdder empadd = new EmployeeAdder();
	try {
		empadd.AddEmployee(emp);
	}
	catch(RuntimeException e) {
		System.out.println("error : " + e.getMessage());
	}
}

}
