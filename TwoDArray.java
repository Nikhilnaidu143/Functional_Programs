import java.io.PrintStream;
import java.util.Scanner;

public class TwoDArray {
   static Scanner input = new Scanner(System.in);
   PrintStream pr = new PrintStream(System.out);

   public void integer2Darray(int m , int n){
      int[][] twoDarray = new int[m][n];
      for(int i = 0; i<m; i++) {
         for(int j=0; j<n; j++) {
            System.out.println("Enter the element for " + i + " row " + j + " column.");
            twoDarray[i][j] = input.nextInt();
         }
      }
      for(int i = 0; i<m; i++) {
         for(int j=0; j<n; j++) {
            pr.print(twoDarray[i][j] + " ");
         }
         System.out.println("\n");
      }
   }
   public void boolean2DArray(int m , int n){
      boolean[][] twoDarray = new boolean[m][n];
      for(int i = 0; i<m; i++) {
         for(int j=0; j<n; j++) {
            System.out.println("Enter the element for " + i + " row " + j + " column.");
            twoDarray[i][j] = input.nextBoolean();
         }
      }
      for(int i = 0; i<m; i++) {
         for(int j=0; j<n; j++) {
            pr.print(twoDarray[i][j] + " ");
         }
         System.out.println("\n");
      }
   }
   public void double2DArray(int m , int n){
      double[][] twoDarray = new double[m][n];
      for(int i = 0; i<m; i++) {
         for(int j=0; j<n; j++) {
            System.out.println("Enter the element for " + i + " row " + j + " column.");
            twoDarray[i][j] = input.nextDouble();
         }
      }
      for(int i = 0; i<m; i++) {
         for(int j=0; j<n; j++) {
            pr.print(twoDarray[i][j] + " ");
         }
         System.out.println("\n");
      }
		pr.flush();
		pr.close();
   }
   public static void main(String[] args) {

      System.out.println("Enter number of rows :-");
      int m = input.nextInt();
      System.out.println("Enter number of columns :-");
      int n = input.nextInt();

      TwoDArray object = new TwoDArray();

      System.out.println("Enter your choice [1.integer | 2.double | 3.boolean] :- ");
      int choice = input.nextInt();
      switch(choice) {
         case 1:
            object.integer2Darray(m , n);
            break;
         case 2:
            object.double2DArray(m, n);
            break;
         case 3:
            object.boolean2DArray(m, n);
            break;
         default:
            System.out.println("Enter valid input[1/2/3].");
      }
   }
}
