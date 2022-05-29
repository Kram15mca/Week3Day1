package org.student;

import org.department.Department;

public class Student extends Department{

	// creating methods
			public void studentName()
			{
				System.out.println("Student Name Ram");
			}
			
			public void studentDept()
			{
				System.out.println("Student Department Name ECE");
			}
			
			public void studentId()
			{
				System.out.println("Student ID 345345");
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		stu.collegeName();
		stu.collegeRank();
		stu.collegeCode();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();

	}

	

}
