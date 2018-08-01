package adapter;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("avi")) {
			advancedMusicPlayer = new VlcPlayer();
		}
		else if (audioType.equalsIgnoreCase("mov")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}
	
	@Override 
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("avi")) {
			advancedMusicPlayer.playAvi(fileName);
		}
		else if (audioType.equalsIgnoreCase("mov")) {
			advancedMusicPlayer.playMov(fileName);
		}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
