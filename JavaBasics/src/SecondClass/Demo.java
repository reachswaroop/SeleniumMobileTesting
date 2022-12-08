package SecondClass;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
			 
		
			System.out.println("Enter the name"); 
			String name = scan.nextLine(); 

			System.out.println("Enter the Email"); 
			String email = scan.nextLine(); 

			System.out.println("Enter the password"); 
			String password = scan.next(); 

			System.out.println("Enter the age");
			int age=scan.nextInt();
			 
			System.out.println("Enter phone number"); 
			long l = scan.nextLong(); 

			System.out.println("Enter height");
			double height = scan.nextDouble();

			System.out.println("Enter  gender");
			char gender =(char) scan.next().charAt(0);
			 
			Register r = new Register(); 
			r.setName(name); 
			r.setEmail(email); 
			r.setPassword(password); 
			r.setHight(height); 
			r.setAge(age); 
			r.setGender(gender);
			 	
			RegisterDetails rd = new RegisterDetails();
			rd.insertDetails(r);	// here the bean object is sent to the insertDetails method in
			
			
			
			
			
			
			

	}}


