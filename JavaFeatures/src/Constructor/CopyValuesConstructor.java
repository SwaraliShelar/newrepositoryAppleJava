package Constructor;
/*
2.Write a program to copy values of one object into another by assigning the values of
one object into another.
*/

	public class CopyValuesConstructor
{
	       int id;
	       String name;               
	 
	       CopyValuesConstructor(int id, String name)
	       {
	            System.out.println("Constructor called.");
	            this.id = id;
	            this.name = name;
	       }
	 
	        //Copy value of one object into another.
	        CopyValuesConstructor(CopyValuesConstructor obj)
	        {
	            System.out.println("Constructor called for copying value.");
	            this.id = obj.id;
	            this.name = obj.name;
	        }
	 
	        public static void main(String[] args)
	        {
	           //parameterized constructor call
	           CopyValuesConstructor obj1 = new CopyValuesConstructor(10, "W3spoint");
	 
	           //print values of object properties.  
	           System.out.println("obj1 id = " + obj1.id);
	           System.out.println("obj1 name = " + obj1.name);
	           //Constructor call to copy the value of one object into other.
	           CopyValuesConstructor obj2 = new CopyValuesConstructor(obj1);
	           //print values of object properties. 
	           System.out.println("obj2 id = " + obj2.id);
	           System.out.println("obj2 name= " + obj2.name);
	       }
	}

