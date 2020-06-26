package first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
			PersonalInfo personalInfo = new PersonalInfo("Khaleeq","Rahman",18);
			Address address = new Address("CortezCourt","L8Z 2Z9","Ottawa","Canada");
			//Customer customer = new Customer(50000,personalInfo,address);
			
			//customer.display();
			
			
			try {
				File customer = new File ("C:\\Users\\napev-PS\\git\\CSV\\Assignments\\src\\first\\customer.csv");
				Scanner filereader = new Scanner (customer);
				while(filereader.hasNextLine()){
					String data = filereader.nextLine();
					
					System.out.println(data);
										
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
			}
		 }
