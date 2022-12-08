package SecondClass;

public class RelationOperator {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter b value : ");
		
		int b = scan.nextInt();
		
		System.out.println("Enter c value : ");
		
		int c = scan.nextInt();
		
		
		if(a==b && a==c && b==c )
		{
			System.out.println("A and B are equal");
		}
		else if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>c && b>a)
		{
			System.out.println("B is greater");
		} }