package animals;

public class Comparator {
	public static <T extends Animal> boolean isSameSpecies(T animal1, T animal2) {
		return animal1.getClass().equals(animal2.getClass());
	}
}
