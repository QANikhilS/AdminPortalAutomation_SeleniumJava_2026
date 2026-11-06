package practicePrograms;

//Remove Duplicates from String

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "Programminggoo";

		String result = "";
		
		for(char c : str.toCharArray()) {
			if(result.indexOf(c)==-1) result +=c;
		}
		System.out.println("After Removing the Duplicates String is : " +result);

	}

}
