
public class Song {

	private String song_title;
	private Artist artist_name;
	private Album album_title;
	
	public Song(String song_title, Artist artist_name, Album album_title) {
		this.song_title = song_title;
		this.artist_name = artist_name;
		this.album_title = album_title;
	}
	
	@Override
	public String toString() {
		return song_title + " - " + artist_name.getArtist_name() + "\n" + album_title.getAlbum_title() + "(" + album_title.getYear() + ")";
	}

}
