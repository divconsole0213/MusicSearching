package music;
//조상클래스
public class MusicInfo {

	private String genre;
	private int release;
	private String artist;
	private String album;
	private String tite;
	
	
	
	public String getGenre() {
		return genre;
	}



	public int getRelease() {
		return release;
	}



	public String getArtist() {
		return artist;
	}



	public String getAlbum() {
		return album;
	}



	public String getTite() {
		return tite;
	}



	public  MusicInfo(String genre, int release, String artist, String album, String tite) {
		
		this.genre = genre;
		this.release = release;
		this.artist = artist;
		this.album = album;
		this.tite = tite;
	}



	public void MusicInfo() {
		
		System.out.println("genre>>" + this.getGenre());
		System.out.println("release>" + this.getRelease());
		System.out.println("artist>>"+this.getArtist());
		System.out.println("album>>"+this.getAlbum());
		System.out.println("title>>"+this.getTite());
	}







	
	
}
