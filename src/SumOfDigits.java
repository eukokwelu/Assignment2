import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		long number, sum;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter a number : \n");
		
		number = sc.nextLong();
		
		for(sum=0; number!=0; number=number/10) {
			sum = sum + number % 10;
		}
		
		System.out.println("Sum of Digits : " +sum);
	}

}
