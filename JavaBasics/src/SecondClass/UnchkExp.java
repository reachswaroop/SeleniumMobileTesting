package SecondClass;

public class UnchkExp {
public static void main(String[] args) {
 	String s = "raghu";
int i = Integer.parseInt(s);//java.lang.NumberFormatException
 
String name=null;
int len = name.length();//java.lang.NullPointer Exception
 
int a[] = new int[5];
a[6]=95;//java.lang.ArrayIndexOutOfBounds Exception
}
}

