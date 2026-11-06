package practicePrograms;

public class SecondLargestNumberOfAnArray 
{

	public static void main(String[] args) {
	        int[] numbers = {12, 35, 1, 10, 34, 1};
	        
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Single pass to find largest and second largest
	        for (int num : numbers) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest number (array may have duplicate max values or insufficient elements).");
	        } else {
	            System.out.println("The second largest number is: " + secondLargest);
	        }
	    }
	
}
