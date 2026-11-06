package practicePrograms;

// Palindrome Number java code

public class PalindromeNumber {

	public static void main(String[] args) {
		
	int num = 8008, temp=num, rev =0;
	
	while(temp !=0 ) {
		
		rev = rev*10 + temp%10;
		temp /= 10;
		
	}
	
	System.out.println(num == rev ? "Palindrome Number" : "Not Palindrome");
	}

}
