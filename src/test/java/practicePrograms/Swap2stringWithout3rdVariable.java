package practicePrograms;

public class Swap2stringWithout3rdVariable {
	
	public static void main(String[] args) {
		
        String str1 = "Nikhil";
        String str2 = "Shivarkar";

        System.out.println("Before swap: str1 = " + str1 + ", str2 = " + str2);

        // Step 1: Concatenate both strings and store in str1
        str1 = str1 + str2; // str1 becomes "HelloWorld"

        
        // Step 2: Extract the original value of str1 from the concatenated string
        // and assign it to str2
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 becomes "Hello"

       
        // Step 3: Extract the original value of str2 from the concatenated string
        // and assign it to str1
        str1 = str1.substring(str2.length()); // str1 becomes "World"

        System.out.println("After swap: str1 = " + str1 + ", str2 = " + str2);
    }
		
		
	}

	

