package SecondClass;

import java.util.Scanner;

public class LoopWithMethodOverload {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
			int row, col;
			String symbol ="";
			System.out.println("Enter the number of rows:");
			row = scan.nextInt();
			
			System.out.println("Enter the number of coloum: ");
			col = scan.nextInt();
			
			System.out.println("Enter the symbol");
			symbol = scan.next();
					
			for (int i=1; i<=row;i++)
				
			{
				System.out.println();
				for(int j=1;j<=col;j++)
				{
					System.out.print(symbol);
				}
			}
		}
			}
			
		
		
		
		
		
	


