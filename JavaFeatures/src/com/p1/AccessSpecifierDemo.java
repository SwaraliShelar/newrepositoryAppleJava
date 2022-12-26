package com.p1;

public class AccessSpecifierDemo {
	public static void main(String[] args) {
			
Account a1=new Account();
a1.openAccountDetails();
a1.showDetails();//default method it is accessible within package
}
}