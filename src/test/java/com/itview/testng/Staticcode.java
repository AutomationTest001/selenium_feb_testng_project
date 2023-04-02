package com.itview.testng;


class Student
{
	static int id=101;
	 static String name="Selenium";
	
	public static void studentDetails() {
		
		System.out.println(id +" : "+name);
		
	}
}

public class Staticcode {

	public static void main(String[] args) {

		//Student s=new Student();
		//s.studentDetails();
		
		Student.studentDetails();

	}

}
