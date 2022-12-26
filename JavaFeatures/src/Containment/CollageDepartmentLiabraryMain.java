package Containment;

public class CollageDepartmentLiabraryMain {
	public static void main(String[] args) {
		
		Faculty f1 = new Faculty();
		f1.setName("thorat sir");
		f1.setTeachingsubject("physics");

		Library lib1 = new Library();
		lib1.setNoOfbooks(1233);
		lib1.setIncharge("mr patil");

		Department dept1 = new Department();
		dept1.setDept_id(1);
		dept1.setDept_name("economics");
		dept1.setFaculty(f1);

		Collage c1 = new Collage();
		c1.setCode(111);
		c1.setName("D Y Patil");
		c1.setAddress("pune");
		c1.setDepartment(dept1);
		c1.setLibrary(lib1);
		
		System.out.println("Information about Collage and collage Has-A Library or Department as property (refernce object) and Department class Has-A faculty as property (refernce object)\n");
		System.out.println("Collage Code:"+c1.getCode()+"\nCollage Name:"+c1.getName()+"\nCollage Adress:"+c1.getAddress()+"\n"+dept1+"\n"+lib1);
        //System.out.println(c1.getDepartment()+"\n"+c1.getLibrary());
	}
}