package tests;

public class practice {

	
		public static void main(String[] args) 
	    {
		
		// Reverse String	
//		String val = "I love Java";
//		String rev = "";
//		for (int i = val.length() - 1; i >= 0; i -- ) {
//		rev = rev + val.charAt(i);
//		}
//		System.out.println(rev);	
		
	
		// Take two string s1 and s2 which we need to swap.
		String s1 = "Rahul";
		String s2 = "Karan";
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1 + s2;
		// Use the substring method to get the subset of the combined string
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("S1 =" + s1);
		System.out.println("S2 =" + s2);
        System.out.println("------------------------------------------------------------------------------------------------------------");
//---------------------------------------------------------------------------------------------------------------------------------------
		
		
		// Declare variable sum which will store the sum of all digits.
		int sum = 0, num=1234;

		// Run a while loop until the num becomes 0.
		while (num != 0) {
		int rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		}
        System.out.println("Sum of given number is = "+sum);
        System.out.println("------------------------------------------------------------------------------------------------------------");		
		
		
//---------------------------------------------------------------------------------------------------------------------------------------

		int NumberToCheckPrime= 10;
		// Logic to check if a number is prime or not. If its Prime, returns true else
		for (int i = 2; i < NumberToCheckPrime; i++) 
		{
		   if (NumberToCheckPrime % i == 0) 
		   {
		      System.out.println(i+" Number is Prime !!");
		   }
		   else 
		   {   System.out.println(i+" Number is NOT Prime !!");   }
		}
        System.out.println("------------------------------------------------------------------------------------------------------------");		
}		
		
		
		
		
	    



}


			
			
			
			
			
			
			


