package practicePrograms;
// Find Length of the String without .Length()
public class LengthOfString {

	public static void main(String[] args) {
		
		String str = "HarishBadwane";
		int count = 0 ;
		
		for(char c : str.toCharArray()) {
			count++;
		}
		System.out.println("Length of the String is :" +count);
	}

}
