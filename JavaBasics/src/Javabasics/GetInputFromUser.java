

package Javabasics;

import java.util.Scanner;

public class GetInputFromUser {
	public static void main(String args[])
	{
		int n;
		float d;
		String  S;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		S = in.nextLine();
		System.out.println("you enter the string: "+S);
		
		System.out.println("Enter the Number ");
		n = in.nextInt();
		System.out.println("you enter the Number: "+n);
		
		System.out.println("Enter the float numnber");
		d = in.nextFloat();
		System.out.println("you enter the float number: "+d);
		
	
		
		
		
}
}
