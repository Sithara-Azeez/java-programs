import java.util.Scanner;

public class BasicMaths {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("1-Addition\n2-Substraction\n3-Multiplicatio\n4-Division\nEnter your choice:");
		int choice=s.nextInt();
		System.out.println("Enter two numbers:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		Maths obj1=new Maths();
		switch(choice){
		case 1:
			obj1.addition(num1, num2);
			break;
		case 2:
			obj1.substraction(num1, num2);
			break;
		case 3:
			int result=obj1.Multiplication(num1,num2);
			System.out.println("Result is "+result);
			break;
		case 4:
			int k=obj1.division(num1,num2);
			System.out.println("Result is "+k);
			break;
		default:
			System.out.println("Invalid option");
		
		}
		
	}

}