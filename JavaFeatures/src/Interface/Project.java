package Interface;
//e.g of interface
//interface is a collection of abstract methods  only
public interface Project
{
	//interface provides by default abstract and public to methods
	//this are abstract and public methods 
String projectName="Online Jewellary shop";//these method is by default public,static and final
void requirements();
void planning();
void designing();
void development();
void testing();
void deployment();
void maintaince();
default void newChanges()//Backword compatibility
{
	System.out.println("this is parent new changes provids into project without harming another abstract class");
}
static void methodStatic()
{
 System.out.println("old project name is:"+projectName);
}
}