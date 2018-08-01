package adapter;

public class AudioPlayer implements MediaPlayer{	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("mov") || audioType.equalsIgnoreCase("avi")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media. " + audioType + "format not supported at this time");
		}
	}
}
