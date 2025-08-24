package STAGE1;
import java.util.Scanner;


class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	
        String strArr = sc.nextLine();
        strArr = strArr.replace("[", "").replace("]", "").trim();
        
        String[] numbers = strArr.split(",");
        
        int[] check = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] count = new int [check.length];
        
        int n1 = numbers.length;
        
        for(int i = 0;i < n1;i++) {
        	int num = Integer.parseInt(numbers[i].trim());
        	for(int j = 0;j < check.length;j++) {
        		if(num % check[j] == 0) {
        			count[j]++;
        		}
        	}
        }
        
        System.out.print("{");
        for(int i = 0;i < check.length;i++) {
        	System.out.print(check[i]+ ": "+count[i]);
        	if(i < check.length-1) {
        		System.out.print(", ");
        	}
        }
        System.out.println("}");
    }
}
