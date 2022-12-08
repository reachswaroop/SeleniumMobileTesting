package SecondClass;

public class Array {

	public static void main(String[] args) {
		//int state1= 60;
		//int state2= 70;
		//int state3= 80;
		//int state4= 90;
		//int state5= 100;
		int[] state= new int[] {160,170,180,190,200};
		System.out.println("polulation is:" +state);
		System.out.println("Polulation[0] is :"	+state[0]);
		System.out.println("Polulation[1] is :"	+state[1]);
		for(int i=0;i<state.length;i++) {
			System.out.println("Population["+i+"] is: "+state[i]);
		}
		
	}

}
