
public class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}

	  void introduceYourself() {
	    System.out.println("Jag är en katt som heter " + getName() + ".");
	    System.out.println("Jag är " + getBirthyear() + " år gammal");
	  }
}
