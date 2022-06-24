
public class B extends A {
	int a;
	
	B(){               //Super key using inside constructor   
		
		System.out.println("its B constructor");
	}
	B(int a){
		super(10);
		System.out.println("Argument constructor of B");
	}
	
	void display() {
		super.display();
		System.out.println("its B");
	
		}
	
	void baseDisplay() {
		super.display();
	}
	
	void result() {
		a=20;
		super.a=30;
		int c = a+super.a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		B b=new B();
		//b.display();
		
		/*b.baseDisplay();
		b.result(); */
	}
}
