
public class B extends A {
	int a;
	
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
		b.baseDisplay();
		b.result();
	}
}
