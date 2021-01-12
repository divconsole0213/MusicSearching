package music;

public class Genre extends MusicInfo {

	private String rock;
    private String hiphop;
    private String jazz;
    private String classic;
    private String pop;
    
    
	public String getRock() {
		return rock;
	}



	public String getHiphop() {
		return hiphop;
	}



	public String getJazz() {
		return jazz;
	}



	public String getClassic() {
		return classic;
	}



	public String getPop() {
		return pop;
	}



	public Genre(String genre, int release, String artist, String album, String tite, String rock, String hiphop,
			String jazz, String classic, String pop) {
		super(genre, release, artist, album, tite);
		this.rock = rock;
		this.hiphop = hiphop;
		this.jazz = jazz;
		this.classic = classic;
		this.pop = pop;
	}
	
	
	@Override
	public void MusicInfo() {
		
		super.MusicInfo();
		System.out.println("rock>>"+this.getRock());
		System.out.println("hiphop>>"+ this.getHiphop());
		System.out.println("jazz>>"+this.getJazz());
		System.out.println("classic>>"+this.getClassic());
		System.out.println("pop>>"+this.getPop());
	}
	





	}

