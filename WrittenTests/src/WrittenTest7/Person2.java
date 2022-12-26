package WrittenTest7;

public class Person2 {
	
		int id;
		String pName , contact , address;
		IdProof2 i ;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPName() {
			return pName;
		}

		public void setPName(String pName) {
			this.pName = pName;
		}

		public String getContact() {
			return contact;
		}


		public void setContact(String contact) {
			this.contact = contact;
		}


		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public IdProof2 getI() {
			return i;
		}

		public void setI(IdProof2 i) {
			this.i = i;
		}

		void display()
		{
			if(getAddress().equalsIgnoreCase("pune"))
			{
				System.out.println("person ID: "+getId()+"\n"+"person name: "+getPName()+"\n"+"contact number: "+getContact()+"\n"+"address: "+getAddress());
			}
			else
			{
				System.out.println("details will show only if you are from pune");
			}
		}


	}

