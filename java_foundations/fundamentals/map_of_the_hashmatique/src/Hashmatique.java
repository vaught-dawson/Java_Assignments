import java.util.*;

public class Hashmatique {
	
	private HashMap<String, String> trackList;
	
	public Hashmatique(String[] songNames, String[] lyrics) {
		this.trackList = new HashMap<String, String>();
		
		for (int i = 0; i < songNames.length; i++) {
			trackList.put(songNames[i], lyrics[i]);
		}
	}
	
	public Hashmatique(HashMap<String, String> songMap) {
		this.trackList = songMap;
	}
	
	public Hashmatique() {
		this.trackList = new HashMap<String, String>();
	}
	
	public void addTrack(String song, String lyrics) {
		trackList.put(song, lyrics);
	}
	
	public HashMap<String, String> getTracks() {
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
	
	@Override
	public String toString() {
		return String.format("There are %o tracks", trackList.keySet().size());
	}
}
