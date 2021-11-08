import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [a] :- ");
		int a = input.nextInt();
		System.out.print("Enter a number [b] :- ");
		int b = input.nextInt();
		System.out.print("Enter a number [c] :- ");
		int c = input.nextInt();

		/* equation a*x*x+b*x+c */

		System.out.println("\nThe 2 roots of the equation a*x*x+b*x+c are :- ");

		/* delta = b*b-4*a*c */

		double delta =  (Math.pow(b, 2) - (4 * a * c));

		double Root_1 = (-b + Math.sqrt(delta)/(2*a));
		double Root_2 = (-b - Math.sqrt(delta)/(2*a));

		System.out.println("Root 1 of x = " + Root_1);
		System.out.println("Root 2 of x = " + Root_2);
	}
}
