
public class LinearSearch {
	   public static void main(String[] args) {
	        //create some dummy data for our method
		   char letter = 'm';
	        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	        //call your methods here
	        LinearSearch ls = new LinearSearch();
	        
	        System.out.println(ls.findLetter(letter, letters));
	    }

	    //create your first method here
	   public int findLetter(char target, char[] data) {
		   int result = -1;
		   
		   //loop through data
		   for (int i = 0; i < data.length; i++) {
			   char temp = data[i];
			   
			   //test element against target
			   if (temp == target) return i;
		   }
		   
		   return result;
	   }
}
