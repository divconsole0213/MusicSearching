package music;

public class title extends MusicInfo{
	private String title;

	
	public String getTitle() {
		return title;
	}


	public title(String genre, int release, String artist, String album, String tite, String title) {
		super(genre, release, artist, album, tite);
		this.title = title;
	}
	
	@Override
	public void MusicInfo() {
		
		super.MusicInfo();
	    System.out.println("음악정보>>" + this.getTite());
	}
	

}
