package WrittenTest7;

public class UnivercityCollageSingleInheritance 
{
public static void main(String[] args) {
	Collage c=new Collage();
	c.setUnivercityname("shivaji univercity");
	c.setCource("1.Bcs 2.Bsc 3.Btech 4.Animaton");
	c.setCollagename("YCIS satara");
	c.setRegino("101");
	System.out.println("Univercity name:"+c.getUnivercityname()+"\nCources:"+c.getCource()+"\nCollage name:"+c.getCollagename()+"\nCollage Registration number:"+c.getRegino());
}
}
