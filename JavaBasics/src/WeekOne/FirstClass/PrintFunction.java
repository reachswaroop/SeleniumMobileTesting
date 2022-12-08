package WeekOne.FirstClass;

public class PrintFunction {

	public static void main(String[] args) {
		
		String name = "Ethan";
		
		System.out.println("Welcome " + name + ", Lets do some calculation!");
		 add();
		 sub();
		 mul();
		 div();
		  
		 
		
	}

	private static void div() {
		float a,b,c;
		a=50;
		b=30;
		c=a/b;
		System.out.println(c);	
		
	}

	private static void mul() {
		int a,b,c;
		a=20;
		b=30;
		c=a*b;
		System.out.println(c);	
		
	}

	private static void sub() {		
			int a,b,c;
			a=20;
			b=30;
			c=a-b;
			System.out.println(c);		
	}

	private static void add() {
		int a,b,c;
		a=20;
		b=30;
		c=a+b;
		System.out.println(c);
		
	}

}