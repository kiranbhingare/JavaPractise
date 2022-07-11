package JavaInterviewPractise;

public class armstrong_number {

	public static void main(String[] args) {
		isArmstrong(153); // no need to print the method, just call it and pass the parameter
	}
	
	public static void isArmstrong(int num) {
		int r;
		int cube = 0;
		int t; 
		t = num; 
		while(num>0) {
			r = num % 10;
			num = num / 10;
			cube = cube + r*r*r;
		}
		if (t == cube) {
			System.out.println("it is armstrong");
		}else {
			System.out.println("it is not armstrong");
		}
	}
}
