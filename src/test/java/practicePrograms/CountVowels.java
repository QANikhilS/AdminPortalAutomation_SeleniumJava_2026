package practicePrograms;

// Java code for Count Vowels and Consonants
public class CountVowels {

	public static void main(String[] args) {
		
		String str = "ABCDEFgHiJKLMNOPQRsTUVWXYZ";
		int vowels =0, consonant =0;
		
		str= str.toLowerCase();
		
		for(char c : str.toCharArray()) {
			
			if("aeiou".indexOf(c)!=-1) vowels++;
			else if(c>='a' && c<='z') consonant++;
		}
		System.out.println("Vowels : "+vowels+", Consonants :"+consonant);
		
	}

}
