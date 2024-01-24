package playlist;

import java.util.Arrays;

public class TestSong {
	public static void main(String[] args) {
		Song[] songs = {new Song("Title 1", "Artist 1", 3.90),
						new Song("Ti", "Abc", 4.6),
						new Song("Title 3", "Artist 3", 5.321),
						new Song("Title 4", "Artist 4", 4.6),
						new Song("Title 5", "Artist 5", 3.63)};

		System.out.println("Songs before sorting: " + Arrays.toString(songs));
		Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
		System.out.println("Songs after sorting: " + Arrays.toString(songs));
	}
}
