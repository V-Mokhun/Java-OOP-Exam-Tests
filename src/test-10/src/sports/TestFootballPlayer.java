package sports;

public class TestFootballPlayer {
	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo", new int[]{3, 1, 1, 2, 4});
		try {
			FootballPlayer clonedPlayer = player.clone();
			player.changeLastGoal(0);

			System.out.println(player);
			System.out.println(clonedPlayer);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
