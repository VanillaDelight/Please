import java.util.ArrayList;

public class Artist {

	private String artist_name;
	private ArrayList<Album> album_list = new ArrayList<Album>();
	public Artist(String artist_name) {
		this.artist_name = artist_name;
	}

	public void addAlbum(Album album_title) {
		album_list.add(album_title);
	}

	public ArrayList<Album> getAlbums() {
		return album_list;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public ArrayList<Album> getAlbum_list() {
		return album_list;
	}
	
}
