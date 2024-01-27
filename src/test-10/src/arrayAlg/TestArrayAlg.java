package arrayAlg;

public class TestArrayAlg {
	public static void main(String[] args) {
		VideoGame[] games = {
						new VideoGame("Dota 2", "Valve", 3),
						new VideoGame("Starcraft", "Blizzard", 4),
						new VideoGame("World of Warcraft", "Blizzard", 7),
						new VideoGame("Counter-Strike", "Valve", 5)
		};

		System.out.println(ArrayAlg.findMaxIndex(games));
	}
}
