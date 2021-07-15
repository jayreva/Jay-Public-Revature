
public class ConditionalBlocks {
	 public static void main(String[] args) {  
		   boolean b = false;
		   boolean a = true;
		  
		   if (b){  
		  System.out.println("inside the if-statement");  
		   		if (a) {
			    System.out.println("inside the nested if-statement");
		   		} 
		   }
		   else if(a) {
			   System.out.println(5);
		   }
		   else {
			   System.out.println("inside the else-statement");
		   }
		  
		   System.out.println("Outside of the if-statement");  
		 }  
}
