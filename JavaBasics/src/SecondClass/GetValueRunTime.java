package SecondClass;
import java.util.Scanner;

public class GetValueRunTime {

	public static void main(String[] args) {
		
		Scanner Scan= new Scanner(System.in);//Object creation
		System.out.println("Eneter the value of A : ");
		int a = Scan.nextInt();
		System.out.println("Enter the value of B : ");
		int b = Scan.nextInt();
		int total = a+b;
		System.out.println("Total of a and b is : " +total);
		System.out.println("Enter the value of c : ");
		int c = Scan.nextInt();
		int total1= a+b+c;
		System.out.println("The total is : " +total1);
		
		

	}

}
