public class Bird extends Animal {
	private Toy toy;
	private Animal friend;
	Bird(String name, int age) {
		super(name, age);
	}

	void introduceYourself() {
		System.out.println("Jag är en fågel som heter " + getName() + ".");
		System.out.println("Jag är " + getBirthyear() + " år gammal");
	}
}
