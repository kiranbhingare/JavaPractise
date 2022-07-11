package JavaInterviewPractise;

public class swap_two_numbers {
	
	public static void main(String[] args) {
		//Without using third variable
		int a = 20;
		int b = 10;
		b = b + a; 
		a = b - a;
		b = b - a;
		System.out.println("Now after swapping the value of a is: " + a + " and b is: " + b);
		
		//Using third variable
		int c = a;
		a = b;
		b = c;
		System.out.println("Now after swapping the value of a is: " + a + " and b is: " + b);
	}
}
