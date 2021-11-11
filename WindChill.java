/* WIND CHILL */
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature [t] in Fahrenheit :- ");
		double t = input.nextDouble();
		System.out.print("Enter wind speed [v] in miles per hour :- ");
		double v = input.nextDouble();

		if((t >= -50 && t <= 50) && (v >= 3 && v <= 120)){
			float w = (float)(35.74+0.6215+(0.4275*t-35.75)*Math.pow(v, 0.16)); 
			System.out.println("\nThe Temperature in Fahrenheit = " + t);
			System.out.println("The Wind Speed in miles per hour = " + v);
			System.out.println("The Wind Chill = " + w);
		}
		else {
			System.out.println("\nEnter valid inputs. ");
		}
	}
}
