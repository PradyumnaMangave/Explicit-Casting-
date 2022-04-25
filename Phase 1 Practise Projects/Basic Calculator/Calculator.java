import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int num1,num2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		num1 = in.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		num2 =in.nextInt();
		
		System.out.println("Sum = "+(num1+num2));
		System.out.println("Substraction = "+(num1-num2));
		System.out.println("Multiplication = "+(num1*num2));
		System.out.println("Division = "+(num1/num2));
	}
}
