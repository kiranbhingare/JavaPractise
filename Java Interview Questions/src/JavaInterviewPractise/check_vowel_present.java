package JavaInterviewPractise;

public class check_vowel_present {
		
	public static void main (String[] args) {
		String s = "Kiran";
		System.out.println(stringContainsVowels(s));
	}
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
