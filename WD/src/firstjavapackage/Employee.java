package firstjavapackage;

public class Employee {

	String empName;
	int empId;
	String empSalary;
	String empDesg;

   //constructor

	public Employee(String empName, int empId, String empSalary, String empDesg) {

		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDesg = empDesg;
	}

	public static void main(String[] args) {
		Employee obj1 = new Employee("XYZ", 1, "8 lakhs", "SSE");
		System.out.println(obj1.empName);
		System.out.println(obj1.empId);
		System.out.println(obj1.empSalary);
		System.out.println(obj1.empDesg);

		Employee obj2 = new Employee("ABC", 2, "10 lakhs", "ATL");

		System.out.println(obj2.empName);
		System.out.println(obj2.empId);
		System.out.println(obj2.empSalary);
		System.out.println(obj2.empDesg);

	}

}
