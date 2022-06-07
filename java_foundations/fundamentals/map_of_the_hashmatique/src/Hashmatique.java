import java.util.*;

public class Hashmatique {
	
	HashMap<String, String> trackList;
	
	public Hashmatique(String[] songNames, String[] lyrics) {
		this.trackList = new HashMap<String, String>();
		
		for (int i = 0; i < songNames.length; i++) {
			trackList.put(songNames[i], lyrics[i]);
		}
	}
	
	public Hashmatique(HashMap<String, String> songMap) {
		this.trackList = songMap;
	}
	
	public void addTrack(String song, String lyrics) {
		trackList.put(song, lyrics);
	}
	
	public HashMap<String, String> getSongs() {
		return this.trackList;
	}
	
	public String getTrack(String song) {
		return trackList.get(song);
	}
	
	public void displayTracks() {
		Set<String> trackNames = trackList.keySet();
		
		for (String songName : trackNames) {
			System.out.printf("%s: %s\n", songName, trackList.get(songName));
		}
		
		System.out.println("");
	}
}
