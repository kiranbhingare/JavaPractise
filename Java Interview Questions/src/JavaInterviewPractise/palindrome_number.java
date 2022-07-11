package JavaInterviewPractise;

public class palindrome_number {
	 
	public static void main(String[] args) {
		isPalindrome(1211); // no need to print the method, just call it and pass the parameter
	}
	
	public static void isPalindrome(int num) {
		int r = 0;
		int sum = 0;
		int t; 
		t = num; 
		while(num>0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
	}
}


// that remains the same when its digits are reversed. 