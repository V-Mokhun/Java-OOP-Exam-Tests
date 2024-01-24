package playlist;

public class Song {
	private String title;
	private String artist;
	private double duration;

	public Song(String title, String artist, double duration) {
		this.title = title == null ? "" : title;
		this.artist = artist == null ? "" : artist;
		this.duration = duration < 0 ? 0 : duration;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public double getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "Title: " + title + ". Artist: " + artist + ". Duration: " + duration + ".";
	}

}
