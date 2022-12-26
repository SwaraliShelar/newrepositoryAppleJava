package UpcastingAndDowncasting;

public class ParentChildMain {
	public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham";  
          
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Child c = (Child)p;   
    
       c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }
}
