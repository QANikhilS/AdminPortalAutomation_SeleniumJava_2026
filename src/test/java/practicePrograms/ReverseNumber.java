package practicePrograms;
//Reverse Number hava code
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num =12345 , rev =0 ;
		
		while(num != 0 ) {
			
			rev = rev*10 + num%10;
			num /= 10;
		}
		
		System.out.println("Reverse Number : " +rev);

		// Output is 54321
	}

}
