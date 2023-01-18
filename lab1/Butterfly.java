
public class Butterfly extends Animal {
	private Toy toy;
	private Animal friend;
	Butterfly(String name, int age) {
		super(name, age);
	}

	void introduceYourself() {
		System.out.println("Jag är en fjäril som heter " + getName() + ".");
		System.out.println("Jag är " + getBirthyear() + " år gammal");
	}
}
