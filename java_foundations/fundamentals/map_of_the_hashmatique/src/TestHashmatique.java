
public class TestHashmatique {

	public static void main(String[] args) {
		String[] songNames = {"Never Gonna Give You Up", "The Mind Electric", "Come Hang Out"};
		String[] lyrics = {"We're no strangers to love, You know the rules and so do I (do I)", 
				"Think of these thoughts as limitless light, Exposing closing circuitry of fright",
				"Come hang out, 'Cause you're outta your mind"
			};
		
		Hashmatique trackManager = new Hashmatique(songNames, lyrics);
		
		trackManager.displayTracks();
		
		trackManager.addTrack("Beat It", "They told him, \"Don't you ever come around here\", \"Don't wanna see your face, you better disappear\"");
				
		trackManager.displayTracks();
		
		System.out.println(trackManager.getTrack("The Mind Electric"));
	}

}
