package lab1Test;

import java.util.ArrayList;

class House {

	ArrayList<Animal> animalList = new ArrayList<>();

	public void print() {
		System.out.println("Följande djur finns i huset:");

		for (Animal animal : animalList) {
			animal.print();
		}
	}

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

}
