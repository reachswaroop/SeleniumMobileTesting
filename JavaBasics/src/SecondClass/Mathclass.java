package SecondClass;

import java.util.Scanner;

public class Mathclass {
	public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("Enter the value");
int a = scan.nextInt();
System.out.println("Enter the value of B: ");
int b= scan.nextInt();
System.out.println(Math.max(a,b));
System.out.println(Math.min(a,b));
int c=36;
double d=20.7;
System.out.println(Math.sqrt(c));
System.out.println(Math.abs(c));
System.out.println(Math.round(d));
System.out.println(Math.ceil(d));
System.out.println(Math.floor(d));

}
}