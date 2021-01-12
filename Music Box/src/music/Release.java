package music;

public class Release extends MusicInfo {
	
	private int release;
	
	

	public int getRelease() {
		return release;
	}



	public Release(String genre, int release, String artist, String album, String tite) {
		super(genre, release, artist, album, tite);
		this.release = release;
	}

	@Override
	public void MusicInfo() {
		super.MusicInfo();
		System.out.println("release>>" + this.getRelease());
	}

	
	
	}
	
	


