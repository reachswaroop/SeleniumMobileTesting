package SecondClass;

public class RelationalOperator1 {
	

	public static void main(String[] args) {
		orfunction();
		
	}

	private static void orfunction() {
		boolean Passport = true;
		boolean Driverlic = false;
		boolean Criminal = true;
	//	if (Passport || Driverlic)
		//{
	//		System.out.println("You are allowed to Participate");
	//	}
		else if(!Criminal)
		{
			System.out.println("you have clear records");
			
		}
		else
		{
			System.out.println("you are not allowed");
		}
		
		}
	
	}


