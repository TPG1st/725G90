
public class Dog extends Animal {
	private Toy toy;
	private Animal friend;
	Dog(String name, int age) {
		super(name, age);
	}

	void introduceYourself() {
		System.out.println("Jag är en hund som heter " + getName() + ".");
		System.out.println("Jag är " + getBirthyear() + " år gammal");
	}
}
