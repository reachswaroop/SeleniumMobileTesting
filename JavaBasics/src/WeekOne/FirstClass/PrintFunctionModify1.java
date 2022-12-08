package WeekOne.FirstClass;

public class PrintFunctionModify1 {
	static int a=20;
	static int b=30;//global declation 

	public static void main(String[] args) {
		
		String name = "Ethan";
		Student Ethan = new Student("Ethan", 10, 85,79,99);
		Student Ivanka = new Student("Ivanka", 10, 70,80,59);
		
		System.out.println(Ethan.name);
		Ethan.seatYesOrNo();
		System.out.println(Ivanka.name);
		Ivanka.seatYesOrNo();
		
		
		System.out.println("Welcome " + name + ", Lets do some calculation!");
		
		  
		 add();
		 sub();
		 mul();
		 div();
		  
		 
		
	}

	private static void div() {//a and b parameters
		
		System.out.println(a/b);	
		
	}

	private static void mul() {
		
		System.out.println(a*b);	
		
	}

	private static void sub() {		
		
			System.out.println(a-b);		
	}

	private static void add() {
		
		System.out.println(a+b);
		
	}

}