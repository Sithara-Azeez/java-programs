package forloop;

import java.util.Scanner;

public class ForLoop {
	public static void main(String ar[]) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		for(int i=0;i<num;i++) {
			sum=sum+i;
		}
		System.out.println("Result:"+sum);
	}

}
