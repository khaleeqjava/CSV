package first;

public class Customer {
	private int id;
	private PersonalInfo personalInfo;
	private Address address;
	
	public Customer(int id, PersonalInfo personalInfo, Address address) {
		super();
		this.id = id;
		this.personalInfo = personalInfo;
		this.address = address;
	}

	void display(){  
		System.out.println("ID:" +id); 
		System.out.println(personalInfo.getFirstName()+" "+personalInfo.getLastName()+" "+personalInfo.getAge());
		System.out.println(address.getStreet()+" "+address.getPostalCode()+" "+address.getCity()+" "+address.getCountry());  
		}  
	
	}