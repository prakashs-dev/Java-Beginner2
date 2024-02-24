package Java8_Version;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empId;
	String empName;
	long empSalary;

	public Employee(int empId, String empName, long empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", empSalary=" + empSalary + '}';
//	}
}

public class SamProblem {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "John", 23000));
		emp.add(new Employee(2, "Doug", 190000));
		emp.add(new Employee(3, "Jack", 200000));
		emp.add(new Employee(4, "Daisy", 240000));
		emp.add(new Employee(5, "William", 220000));

//		 1: Print the employee data using the stream
//		emp.stream().forEach(employee -> System.out.println(employee));

//		 2: Print the employee data by sorting employee salaries in descending order.

//		List<Employee> sortedDescOrder = emp.stream()
//				.sorted(Comparator.comparingLong(Employee::getEmpSalary).reversed()).collect(Collectors.toList());
//		sortedDescOrder.forEach(empData -> System.out.println(empData));

//		3: Filter the employee names starting with ‘J’

//		emp.stream().filter(employee -> employee.getEmpName().startsWith("J")).collect(Collectors.toList())
//				.forEach(empName -> System.out.println(empName));

//		4: Add 10000 to each employee’s salary and print

//		emp.stream().map(employee -> employee.getEmpSalary() + 10000).collect(Collectors.toList())
//				.forEach(salary -> System.out.println(salary));

//		5: Return the employee object having max salary

		Employee employee = emp.stream().reduce((emp1, emp2) -> emp1.getEmpSalary() > emp2.getEmpSalary() ? emp1 : emp2)
				.get();
		System.out.println(employee);
	}
}
