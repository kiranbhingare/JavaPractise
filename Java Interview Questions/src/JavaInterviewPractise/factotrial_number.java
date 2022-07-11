package JavaInterviewPractise;

public class factotrial_number {
	
	public static void main(String[] args) {
		System.out.println(Factorial(10));
		System.out.println(Factorial(10));
	}
	
	public static int Factorial(int num) {
		int fact = 1; 
		for (int i = 1; i<= num; i++) {
			fact = fact *i;
		}
		return fact;
	}
	
	public static int FactorialNumber(int num) {
		int fact = 1;
		if (num<=0) {
			return 1;
		}else {
			return (num * FactorialNumber(num-1));
		}
	}

}
