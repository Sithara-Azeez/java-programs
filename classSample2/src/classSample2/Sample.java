package classSample2;

import java.util.Scanner;

public class Sample {
	public static void main(String a[]) {
		Sum obj1 = new Sum();
		Sum obj2 = new Sum();
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=100;
		obj1.calculateSum(num1,num2);
		obj1.displaySum();
		
		obj2.calculateSum(num1, num3);
		obj2.displaySum();
		
		
	}

}
