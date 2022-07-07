
public abstract class Google {
	abstract void search();
	
	void message() {
		System.out.println("Thank You for using Google..!");
	}

}

class SearchAll extends Google{
	
	void search() {
		System.out.println("All Search Results.");
	}
}

class SearchImage extends Google{
	
	void search() {
		System.out.println("Image search results.");
	}
}

class SearchVideo extends Google{
	
	void search() {
		System.out.println("Video search results.");
	}
}