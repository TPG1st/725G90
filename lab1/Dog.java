
public class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age);
	}

	  void introduceYourself() {
	    System.out.println("Jag är en hund som heter " + getName() + ".");
	    System.out.println("Jag är " + getBirthyear() + " år gammal");
	  }
}
