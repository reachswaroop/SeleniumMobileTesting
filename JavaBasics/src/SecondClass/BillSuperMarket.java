package SecondClass;

import java.util.Scanner;

public class BillSuperMarket {
	int prroductOne;
	int prodcutTwo;
	int productThree;
	
	BillSuperMarket(int productOne)
	{
		Scanner ProductOne= new Scanner(System.in);//Object creation
		System.out.println("Eneter the value of a product : ");
		int a = ProductOne.nextInt();
		System.out.println("The bill amount is " + a );
		
	}
	BillSuperMarket(int productOne,int productTwo)

			{
	this.prroductOne= productOne;
	this.prodcutTwo = productTwo;
	
	Scanner ProductOne= new Scanner(System.in);//Object creation
	Scanner ProductTwo= new Scanner(System.in);
	System.out.println("Enter the value of a products : ");
	int a = ProductOne.nextInt();
	int b = ProductTwo.nextInt();
	int billAmount = a+b;
	
	System.out.println("The bill amount is " + billAmount);
	

	}
	BillSuperMarket(int productOne,int productTwo,int productThree)
	{
	this.prroductOne= productOne;
	this.prodcutTwo = productTwo;
	this.productThree = productThree;
	Scanner ProductOne= new Scanner(System.in);//Object creation
	Scanner ProductTwo= new Scanner(System.in);
	Scanner ProductThree= new Scanner(System.in);
	System.out.println("Enter the value of a products :  ");
	int a = ProductOne.nextInt();
	int b = ProductTwo.nextInt();
	int c = ProductThree.nextInt();
	int billAmount = a+b+c;
	
	System.out.println("The bill amount is : " + billAmount);
	
	}
	
	
	}


