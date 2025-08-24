package STAGE1;

import java.util.Scanner;

public class Program_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		int i = 1;
		int count = 1;
		
		System.out.print("Output: ");
		while(count <= a) {
			
			System.out.print(i);
			if(count <= a - 1) {
				System.out.print(", ");
			}
			count++;
			i += 2;
		}
	}
}
