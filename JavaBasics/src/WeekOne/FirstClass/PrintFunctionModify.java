package WeekOne.FirstClass;

public class PrintFunctionModify {

	public static void main(String[] args) {
		
		String name = "Ethan";
		
		System.out.println("Welcome " + name + ", Lets do some calculation!");
		int a=30;
		int b=20;
		  
		  add(a,b);
		 sub(a,b);
		 mul(a,b);
		 div(a,b);
		  
		 
		
	}

	private static void div(int a, int b) {//a and b parameters
		
		System.out.println(a/b);	
		
	}

	private static void mul(int a, int b) {
		
		System.out.println(a*b);	
		
	}

	private static void sub(int a, int b) {		
		
			System.out.println(a-b);		
	}

	private static void add(int a, int b) {
		
		System.out.println(a+b);
		
	}

}