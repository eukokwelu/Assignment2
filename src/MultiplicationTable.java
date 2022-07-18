import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Multiplication Tables \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 1 and 10 :");
		
		int num = sc.nextInt();
	
	 	for(int i = 1; i <= 10; ++i) {
	 		
	 		System.out.printf("%d * %d = %d \n", num, i, num*i);
			
		}

	}

}
