package animals;

public class TestComparator {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Fido", 3);
		Animal animal2 = new Animal("Rex", 5);
		Dog dog1 = new Dog("Fido", 3, "Labrador");
		Dog dog2 = new Dog("Rex", 5, "Poodle");

		System.out.println("animal1 and animal2 are the same species: " + Comparator.isSameSpecies(animal1, animal2));
		System.out.println("animal1 and dog1 are the same species: " + Comparator.isSameSpecies(animal1, dog1));
		System.out.println("dog1 and dog2 are the same species: " + Comparator.isSameSpecies(dog1, dog2));
	}
}
