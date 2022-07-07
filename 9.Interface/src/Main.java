
public class Main {
	public static void main(String[] args) {
		AudioCall a = new AudioCall();
		VideoCall v = new VideoCall();
		v.calls();
		v.disconnect();
		a.mute();
	}

}
