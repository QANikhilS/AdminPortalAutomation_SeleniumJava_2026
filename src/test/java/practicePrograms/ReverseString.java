package practicePrograms;

// Reverse String Program comment has been changed

public class ReverseString {

	public static void main(String[] args) {
		String  str = "abcdefghijklmnopqrstuvwxyz";
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			rev += str.charAt(i);
		}
		System.out.println("String  : " +str);
		System.out.println("Reverse : " +rev);
		
	}

}