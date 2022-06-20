import java.util.Scanner;

public class PrimeNumber {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int flag=0;
		for(int i=2;i<num/2;i++) {
			if(num%2==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is Prime number");
		}else {
			System.out.println("not Prime number");
		}
	}

}
