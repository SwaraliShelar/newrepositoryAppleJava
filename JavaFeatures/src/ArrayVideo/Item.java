package ArrayVideo;

public class Item 
{
int iid;
String iname;

Item(){}
Item(int iid,String iname)
{
	this.iid=iid;
	this.iname=iname;
}
public String toString()
{
	return"\nitem name"+iid+"  item name:"+iname;
}
}
