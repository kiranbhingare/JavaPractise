package JavaInterviewPractise;

public class prime_number {
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(15));
	}
	
	public static boolean isPrimeNumber(int num) {
		if (num<=1) {
			return false;
		}
		for (int i = 2; i<num; i++) {
			if (num% i == 0) {
				return false;
			}
		}
		return true;
	}
}
