import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [X1] :- ");
		int X = input.nextInt();
		System.out.print("Enter a number [Y] :- ");
		int Y = input.nextInt();

		System.out.println("\nThe Euclidean distance from point (X,Y) to (0,0) is...");

		/* formuale --> diastance = sqrt(x*x + y*y) */

		float distance = (float) Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));

		System.out.println(distance);
	}
}
