package JavaInterviewPractise;

public class fibonacci_series {
	
	  public static void main(String[] args) {

		    int n = 10, firstTerm = 0, secondTerm = 1;

		    for (int i = 1; i <= n; i++) {
		      System.out.print(firstTerm + ",");
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
}
