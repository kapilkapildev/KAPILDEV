package STAGE1;

import java.util.Scanner;

public class Program_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of a : ");
		double a = sc.nextDouble();
		System.out.print("Enter value of b : ");
		double b = sc.nextDouble();
		
		System.out.println("Enter Operation: ");
		String operation = sc.next();
		
		switch(operation) {
				
		case "Addition":
			System.out.println("Sum of value: " + (a + b));
			break;
			
		case "Subtraction":
			System.out.println("Sub of value: " + (a - b));
			break;
			
		case "Multiplication":
			System.out.println("Mul of value: " + (a * b));
			break;
			
		case "Division":
			System.out.println("Div of value: " + (a / b));
			break;
			
		default:
			System.out.println("Give a Integer Value");
				
		
		}
	}
			
}
