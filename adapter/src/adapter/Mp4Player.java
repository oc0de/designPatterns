package adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playAvi(String fileName) {
		System.out.println("Playing avi file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

	@Override
	public void playMov(String fileName) {
		System.out.println("Playing mov file. Name: " + fileName);
		
	}

	@Override
	public void playFlv(String fileName) {
		// do nothing
		
	}

}
