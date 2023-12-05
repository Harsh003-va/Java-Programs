import java.util.Scanner;

public class advancePattern {
    public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col");
		int row = sc.nextInt();
		int col = sc.nextInt();
				
    	for (int i = 1; i <= row; i++) {
			for (int j = 1 ; j <= col; j++) 
            if((i==1 || i==col) || (j==1 || j==col) || (i==row))

				   System.out.print("*");
				else
			       System.out.print(" ");
			
			System.out.println();
		}
    }
}
