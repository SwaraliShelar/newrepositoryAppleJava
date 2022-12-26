/*Create a class Person(id,name,contact,address,idproof[])
Create class IdProof (name,number,validity). 
Display all the persons name contact address who stay in pune and have adhaar card as idproof.
 */
package WrittenTest7;

public class Person1 {
int id;
String name,contact,address,idproof;
void acceptPersonDetails(int id,String name,String contact,String address,String idproof)
{
	this.id=id;
	this.name=name;
	this.contact=contact;
	this.address=address;
	this.idproof=idproof;
}
void displayDetails()
{
	System.out.println("Id:"+id+"\nName:"+name+"\nContact:"+contact+"\nAddress:"+address+"\nIDProof:"+idproof);
}
}
