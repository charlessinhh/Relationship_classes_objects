package employeeManagerReport;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String name;
	String managerName;
	List<Employee> directReports;
	
	Employee(String name, String managerName){
		this.name = name;
		this.managerName = managerName;
		directReports = new ArrayList<>();
	}
	
	void addDirectReport(Employee emp) {
		this.directReports.add(emp);
	}
}
