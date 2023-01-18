
public class Cat extends Animal {
	private Toy toy;
	private Animal friend;
	Cat(String name, int age) {
		super(name, age);
	}

	void introduceYourself() {
		System.out.println("Jag är en katt som heter " + getName() + ".");
		System.out.println("Jag är " + getBirthyear() + " år gammal");
	}
}
