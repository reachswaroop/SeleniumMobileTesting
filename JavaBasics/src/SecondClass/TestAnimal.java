package SecondClass;

public class TestAnimal {
void display1 () {
	System.out.println("Eating");
}

class cat extends TestAnimal {
	void display2 () {
		System.out.println("Meow....");
	}
	
}
class Kitten extends cat {
	void display3 () {
		System.out.println("Hungry....");
	}
}
			
}
//public class AnimalFamily {
	//public static void main(String[] args) { 
		//Kitten k = new Kitten();
		//k.display1();
		//k.display2();
		//k.display3();
	//}
		
	//}
	


