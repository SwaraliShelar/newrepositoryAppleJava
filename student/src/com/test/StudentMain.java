package com.test;

import java.util.Scanner;
import com.dao.StudentOperation;

public class StudentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOperation so = new StudentOperation();
		Scanner sc = new Scanner(System.in);
		String text = " ";

		do {
			System.out.println("1.no of Student Data:");
			System.out.println("2.insert Student data:");
			System.out.println("3.display Student data:");
			System.out.println("4.update Student data:");
			System.out.println("5.delete Student data:");
			System.out.println("6.search Student data:");

			System.out.println("Enter your choice....");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("No. student data");
				 so.studentData();
				break;
			case 2:
				System.out.println("Insert student data");
				so.insertData();
				break;
			case 3:
				System.out.println("Display student data");
				so.displayData();
				break;
			case 4:
				System.out.println("Update student data");
				so.updateData();
				break;
			case 5:
				System.out.println("Delete student data");
				so.deleteData();
				break;
			case 6:
				System.out.println("Search student data");
				so.searchData();
				break;
			default:
				System.out.println("Wrong choice...");

			}
			System.out.println("Do you want to continue ? Y/N:");
			text = sc.next();
		}
		while (text.equalsIgnoreCase("Y"));

	}

}

