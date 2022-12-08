package SecondClass;

 class ExceptionHandling {

	
		
			 public static void main(String args[]){  
				   try{  
				      //code that may raise exception  
				      int data=100/0;  
				      String s=null;  
				      System.out.println(s.length());
				   }
				   catch(Exception e){
					   System.out.println(e);
					   }  
				   //rest code of the program   
				   System.out.println("rest of the code...");  

			 try{  
			      //code that may raise exception  
			      String s=null;  
			      System.out.println(s.length());
			   }
			   catch(Exception e){
				   System.out.println(e);
				   }  
			   //rest code of the program   
			   System.out.println("rest of the code..."); 
			 try{  
			      //code that may raise exception  
				 String s="abc";  
				 int i=Integer.parseInt(s);//NumberFormatException 
			   }
			   catch(Exception e){
				   System.out.println(e);
				   }  
			   //rest code of the program   
			   System.out.println("rest of the code..."); 
			   try{  
				      //code that may raise exception  
				   int a[]=new int[5];  
				   a[10]=50; //ArrayIndexOutOfBoundsException  
				   }
				   catch(Exception e){
					   System.out.println(e);
					   }  
				   //rest code of the program   
				   System.out.println("rest of the code...");
			 }
		


	}


