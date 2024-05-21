package employeeManagerReport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

	Map<String, Employee> employees;
	
	Company(){
		this.employees = new HashMap<>();
	}
	
	String addEmployee(String name, String managerName) {
		
		if(this.employees.containsKey(name)) {
			return "Employee addition failed: Employee already exists.";
		}
		
		Employee manager = this.employees.get(managerName);
		
		Employee newEmp = new Employee(name,managerName);
		this.employees.put(name,newEmp);
		if(manager != null) {
			manager.addDirectReport(newEmp);
		}
		
		return "Employee addition succeed.";
	}
	
	
	Employee find(String employeeName) {
        return this.employees.get(employeeName);
    }

    List<String> getDirectReports(String managerName) {
        Employee manager = this.find(managerName);
        if (manager == null) {
            return List.of("Manager not found.");
        }

        List<String> directReportEmps = new ArrayList<>();
        for (Employee reporting : manager.directReports) {
        	directReportEmps.add(reporting.name);
        }
        return directReportEmps;
    }
}
