package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("MATHIVANAN");
	}
	public void studentDepartment() {
		System.out.println("cse");
	}
	public void studentId() {
		System.out.println("20CS007");
	}
	public static void main(String[] args) {
		Student detail=new Student();
		detail.collegeName();
		detail.collegeCode();
		detail.collegeRank();
		detail.departmentName();
		detail.studentName();
		detail.studentDepartment();
		detail.studentId();
	}

}
