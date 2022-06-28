import java.util.ArrayList;

public class Album {
	private String album_title;
	private int year;
	private Artist artist_name;
	private ArrayList<Song> song_list = new ArrayList<Song>();
	
	public Album(String album_title, int year, Artist artist_name) {
		this.album_title = album_title;
		this.year = year;
		this.artist_name = artist_name;
	}

	public void addTrack(Song song) {
		song_list.add(song);
	}

	public Song getTrack(int i) {
		if (i < 1 || i > song_list.size()) {
			return null;
		}
		return song_list.get(i - 1);
	}

	public int getYear() {
		return year;
	}

	public String getAlbum_title() {
		return album_title;
	}

	public Artist getArtist_name() {
		return artist_name;
	}

	public ArrayList<Song> getSong_list() {
		return song_list;
	}
	
}
