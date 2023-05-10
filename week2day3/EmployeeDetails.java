package week2.day3o1;

public class EmployeeDetails {
	public void employeeName(String empName) {
		System.out.println("Employee Name :"+empName);
	}
	public void employeeID(int empID) {
		System.out.println("Employee ID :"+empID);
	}
	public void employeeAddress(String empAdd1,String empAdd2) {
		System.out.println("Employee Address:"+empAdd1+empAdd2);
	}
	public void employeeSalary(double empSalary) {
		System.out.println("Employee Salary Details :"+empSalary);
	}
	public void employeeMobileNumber(long empMobNum) {
		System.out.println("Employee Mobile Number : "+empMobNum);
	}
	
	public static void main(String[] args) {
		EmployeeDetails details=new EmployeeDetails();
		details.employeeName("AJAY KUMAR S");
		details.employeeID(107);
		details.employeeAddress("Ashok Street,", " Erode");
		details.employeeSalary(45000.50);
		details.employeeMobileNumber(9876543210L);
	}
}
