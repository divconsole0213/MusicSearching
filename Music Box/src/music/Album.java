package music;

public class Album extends MusicInfo {
	private String album;

	
	public String getAlbum() {
		return album;
	}


	public Album(String genre, int release, String artist, String album, String tite) {
		super(genre, release, artist, album, tite);
		this.album = album;
	}
	
	@Override
	public void MusicInfo() {
		
		super.MusicInfo();
		System.out.println("album >>" + this.getAlbum());
		
	}
	

}
