
public interface WhatsAppCalls {
	void calls();
	void mute();
	void disconnect();

}

class AudioCall implements WhatsAppCalls{
	public void calls() {
		System.out.println("WhatsApp Audio Calls..!");
	}
	
	public void mute() {
		System.out.println("Audio Call muted..!");
	}
	
	public void disconnect() {
		System.out.println("Audio Call Disconnected");
	}
}

class VideoCall implements WhatsAppCalls{
	public void calls() {
		System.out.println("WhatsApp Video Calls..!");
	}
	
	public void mute() {
		System.out.println("Video Call muted..!");
	}
	
	public void disconnect() {
		System.out.println("Video Call Disconnected");
	}
}
