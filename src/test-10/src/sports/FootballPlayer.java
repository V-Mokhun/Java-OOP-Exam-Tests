package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable {
	private String name;
	private int[] goals;

	public FootballPlayer(String name, int[] goals) {
		this.name = name;
		this.goals = new int[5];
		for (int i = 0; i < Math.min(5, goals.length); i++) {
			this.goals[i] = goals[i];
		}
	}

	public String getName() {
		return name;
	}

	public void changeLastGoal(int newGoal) {
		goals[goals.length - 1] = newGoal;
	}

	@Override
	public String toString() {
		return "FootballPlayer{" +
						"name='" + name + '\'' +
						", goals=" + Arrays.toString(goals) +
						'}';
	}

	@Override
	protected FootballPlayer clone() throws CloneNotSupportedException {
		FootballPlayer clonedPlayer = (FootballPlayer) super.clone();
		int[] clonedGoals = new int[5];
		for (int i = 0; i < Math.min(5, goals.length); i++) {
			clonedGoals[i] = goals[i];
		}
		clonedPlayer.goals = clonedGoals;
		return clonedPlayer;
	}
}
