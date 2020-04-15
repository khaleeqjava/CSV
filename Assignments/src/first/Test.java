package first;

public class Test {

	public static void main(String[] args) {
		
			PersonalInfo personalInfo = new PersonalInfo("Khaleeq","Rahman",18);
			Address address = new Address("CortezCourt","L8Z 2Z9","Ottawa","Canada");
			Customer customer = new Customer(50000,personalInfo,address);
			
			customer.display();
			}
		 }
