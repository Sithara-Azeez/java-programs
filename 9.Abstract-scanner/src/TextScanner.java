
public class TextScanner {
	Hello obj;
	public TextScanner(Hello obj) {
		this.obj=obj;
		
	}
	
	void scan() {
		String text="Scanned Text";
		obj.onText(text);
	}

}
	
