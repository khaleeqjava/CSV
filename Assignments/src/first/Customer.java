package first;

public class Customer {
	private int id;
	private PersonalInfo personalInfo;
	private Address address;
	
	public Customer() {
		
		personalInfo = new PersonalInfo();
		address = new Address();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", personalInfo=" + personalInfo + ", address=" + address + "]";
	}
	
	

}