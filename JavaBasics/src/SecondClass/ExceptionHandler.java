package SecondClass;

import java.util.Scanner;

public class ExceptionHandler {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		try{
			System.out.println("Enter the number");
			int a = scan.nextInt();
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Invalid Number");
		}
		finally{
			System.out.println("Suceessfully excutes");
		}
			
		}
	}
	
	
					
		
			
		

	

