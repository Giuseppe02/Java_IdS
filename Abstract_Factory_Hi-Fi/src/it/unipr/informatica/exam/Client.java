package it.unipr.informatica.exam;

public class Client {
	DevicesFactory technology;
	public void selectTechnology(DevicesFactory obj) {
		technology = obj;
	}
	public void test(String song) {
		Media media = technology.createMedia();
		Recorder recorder = technology.createRecorder();
		Player player = technology.createPlayer();
		
		recorder.accept(media);
		System.out.println("Recording the song: " + song);
		recorder.record(song);
		System.out.println("Listening the record: ");
		player.accept(media);
		player.play();
		
	}

}
