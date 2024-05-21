package employeeManagerReport;

public class EmployeeManagerReportQuestion {

	/*
	 * Problem Statement Create a simple employee hierarchy where you can add
	 * employees and find their direct reports. The hierarchy should allow you to
	 * add employees with their names and their manager's name. The hierarchy should
	 * also allow you to find the direct reports of a given manager.
	 * 
	 * Requirements Employee Class:
	 * 
	 * Constructor to initialize the employee with a name and manager's name. Method
	 * to add a direct report to this employee. 
	 * 
	 * Company Class:
	 * 
	 * Constructor to initialize an empty company. Method addEmployee(String name,
	 * String managerName) to add a new employee to the company. Method find(String
	 * employeeName) to find an employee by name in the company. Method
	 * getDirectReports(String managerName) to find the direct reports of a given
	 * manager. Input Format Add employees to the company using the
	 * addEmployee(String name, String managerName) method. Find direct reports of a
	 * manager using the getDirectReports(String managerName) method. Example Adding
	 * employees to the company:
	 * 
	 * addEmployee("Alice", "Bob") addEmployee("Charlie", "Bob")
	 * addEmployee("David", "Alice") Finding direct reports:
	 * 
	 * getDirectReports("Bob") should return ["Alice", "Charlie"]
	 * getDirectReports("Alice") should return ["David"]
	 */

	public static void main(String[] args) {
		Company company = new Company();
        company.employees.put("Bob", new Employee("Bob", null)); // Adding a base employee (CEO)

        System.out.println(company.addEmployee("Alice", "Bob"));  // Employee addition succeed
        System.out.println(company.addEmployee("Charlie", "Bob")); // Employee addition succeed
        System.out.println(company.addEmployee("David", "Alice")); // Employee addition succeed

        System.out.println(company.getDirectReports("Bob"));   // [Alice, Charlie]
        System.out.println(company.getDirectReports("Alice")); // [David]
        System.out.println(company.getDirectReports("Charlie")); // []
        System.out.println(company.getDirectReports("Eve"));    // Manager not found.
	}

}
