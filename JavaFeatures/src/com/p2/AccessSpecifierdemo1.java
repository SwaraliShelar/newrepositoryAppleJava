package com.p2;
import com.p1.Account;
/*syntax
import.package.classname 
we import Account class here
 */
public class AccessSpecifierdemo1
{
   public static void main(String[] args) {
	Account a2=new Account();
	a2.openAccountDetails();
	/*fillAccountDetails() set as private method and showDetails() is set as default method in Account class it is not accessible outside the package thats why we write it in
      openAccountDetails() method which is public so we can access it*/
   }
   }