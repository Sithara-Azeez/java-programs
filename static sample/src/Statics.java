
public class Statics {
	int a=10;
	static int b=50;
public static void main(String a[]) {
	
	
	
	Statics h=new Statics();
	Statics h1=new Statics();
	hai();
	h.hello();
	h1.a=90;
	b=100;
	System.out.println("h.a:"+h.a);
	
	System.out.println("h1.a:"+h1.a);
	System.out.println(h1.b);
	System.out.println(h.b);
	
}
void hello() {
	System.out.println("hello");
}
static void hai() {
	
}

}
