import java.util.Scanner;

public class FunctionSample {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int res=sum(num1,num2);
		System.out.println("sum of 2 number is:"+res);
	}
	static int sum(int n1,int n2) {
		int result=n1+n2;
		return result;
	}

}
