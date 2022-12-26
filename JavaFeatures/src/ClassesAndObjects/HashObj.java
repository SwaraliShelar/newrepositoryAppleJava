package ClassesAndObjects;

public class HashObj {
	
public static void main(String[] args) 
{
	HashObj ho1=new HashObj ();
	HashObj ho2=new HashObj ();
      
   System.out.println(ho1+"\n"+ho2);
   
  // ClassesAndObjects.HashObj@515f550a
  // ClassesAndObjects.HashObj@626b2d4a
   
   System.out.println( ho1.hashCode());//1365202186
   System.out.println( ho2.hashCode());//1651191114
   
   HashObj ho3=new HashObj ();
   HashObj ho4=new HashObj ();
   
          ho3=ho4;
          
  System.out.println(ho3+"\n"+ho4);
   //it has same output because we assign(ho3=ho4)
  //ClassesAndObjects.HashObj@5e265ba4
 // ClassesAndObjects.HashObj@5e265ba4
  
  System.out.println( ho3.hashCode());//1579572132
  System.out.println( ho4.hashCode());//1579572132
}
}