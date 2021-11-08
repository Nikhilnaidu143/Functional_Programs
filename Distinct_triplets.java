import java.util.Scanner;
public class Distinct_triplets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [N] :- ");
		int N = input.nextInt();

		int[] a = new int[N];

		for(int i=0; i<N; i++) {
			System.out.print("Please enter " + i + "index element.");
			a[i] = input.nextInt();
		}
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					if(a[i]+a[j]+a[k] == 0) {
						System.out.println("\n" + a[i] + " + " + a[j] + " + " + a[k] + " = " + " 0 ");
					}
				}
			}
		}
		input.close();
	}
}
