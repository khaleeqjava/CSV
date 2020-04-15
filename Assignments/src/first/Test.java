package first;
//import first.Customer;

public class Test {

	public static void main(String[] args) {
		
		 display();
			 
		 }
		private static void display() {
		
			Customer customer = new Customer();
			
			customer.setId(10001);
			customer.getPersonalInfo().setFirstName("Khaleeq");
			customer.getPersonalInfo().setLastName("Rahman");
			customer.getPersonalInfo().setAge(18);
			customer.getAddress().setStreet("Cortez Court");
			customer.getAddress().setPostalCode("L8Z 2Z9");
			customer.getAddress().setCity("Ottawa");
			customer.getAddress().setCountry("Canada");
			
			System.out.println(customer);
		
	}
		 

}
