package harsha;

public class EmployeeAdder {
public  void AddEmployee(Employee emp) {
	if(emp.getEmpid()<=9999 || emp.getEmpid()>99999) {
		throw new InvalidEmployeeidException("invalid id");
	}
	if(emp.getEname().length()<3) {
		throw new InvalidEmployeeNameException("name should be greater than 3 characters");
	}
	if(emp.getSalary()<30000 || emp.getSalary()>80000) {
		throw new InvalidEmployeeSalaryException(" invalid salary");
	}
	System.out.println("enterede Succesfully");
}
}
