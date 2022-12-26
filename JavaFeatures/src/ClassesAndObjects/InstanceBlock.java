package ClassesAndObjects;

public class InstanceBlock {
int id;
String name,producer;
static int a;
{//this is instance block 
//it is used to initialize a global variable
//it does not have a name
	System.out.println("......in instance block.....");	
	//this value cannot print after we write a instance block(constructor) because when object is created object call constructor automatically 
	// 2  3idiots rohit shetty 
	id=2;
	name="3idiots";
	producer="rohit shetty";
	a=100;
}
InstanceBlock()//constructor
{//it is like a constructor thats why these values displays first
	System.out.println(".....in simple constructor.....");
	id=3;
	name="golmal";
	producer="mr roa";
}
void setData(int id,String name,String producer)
{
	this.id=id;
	this.name=name;
	this.producer=producer;
	this.display();//this=m1.display()
}
void display()
{
	System.out.println("movie id:"+id+"\n"+"movie name:"+name+"\n"+"movie producer name:"+producer);
}

public static void main(String[] args) {
	InstanceBlock m1=new InstanceBlock();
	m1.display();
	System.out.println();
	m1.setData(111,"bramha","karan johar");
	
}
}
