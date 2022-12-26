package com.test;

import java.util.Scanner;

import com.dao.EmployeeCrudOperation;

public class EmployeeMain 
{	
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	EmployeeCrudOperation elm=new EmployeeCrudOperation();
	elm.mainArray();
	elm.displayEmployeeData();
	System.out.println("select the operation that you want perform:\n1.addemployee   2.updateEmployee   3.searchEmployee   4.deleteEmployee");
	int num=sc.nextInt();
	switch(num)
	{
	case 1:
	elm.addEmployee();
	elm.displayEmployeeData();
	break;
	
	case 2:
	elm.updateEmployee();
	elm.displayEmployeeData();
	break;
	
	case 3:
	elm.searchEmployee();
	//elm.displayEmployeeData();
	break;
	
	case 4:
	elm.deleteEmployee();
	elm.displayEmployeeData();
    break;
	}
}
}