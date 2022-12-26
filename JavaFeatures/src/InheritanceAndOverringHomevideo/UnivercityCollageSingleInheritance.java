package InheritanceAndOverringHomevideo;

public class UnivercityCollageSingleInheritance 
{
public static void main(String[] args) {
	Collage c=new Collage();
	c.setUnivercityname("shivaji univercity");
	c.setCource("1.bcs 2.bsc 3.btech 4.animaton");
	c.setCollagename("YCIS satara");
	c.setRegino("101");
	System.out.println("Univercity name:"+c.getUnivercityname()+"\nCources:"+c.getCource()+"\nCollage name:"+c.getCollagename()+"\nCoolage Registration number:"+c.getRegino());
}
}
