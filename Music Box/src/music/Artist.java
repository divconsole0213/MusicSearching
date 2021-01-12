package music;

public class Artist extends MusicInfo {
	private String artist;

	
	
	public String getArtist() {
		return artist;
	}



	public Artist(String genre, int release, String artist, String album, String tite) {
		super(genre, release, artist, album, tite);
		this.artist = artist;
	}
	
@Override
public void MusicInfo() {
	super.MusicInfo();
	System.out.println("artist" + this.getArtist());
}

}
