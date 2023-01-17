class Main {

	public static void main(String[] args) {
		Animal.setYear(2019); // Så här anropar man en klassmetod,
		// dvs en statisk metod.
		// Hur ska koden för setYear se ut?

		Animal kurre = new Cat("Kurre", 6);
		Animal vilma = new Dog("Vilma", 3);

		kurre.introduceYourself();
		vilma.introduceYourself();

		Animal.setYear(2013); // Nu blir är ett nytt år för alla djur.

		kurre.introduceYourself();
		vilma.introduceYourself();
//	  Animal kurre = new Cat("Kurre", 2003);
//      Animal vilma = new Dog("Vilma", 2004);
//      
//      kurre.getBirthyear();
//      vilma.getBirthyear();
//      
//      kurre.introduceYourself();
//      vilma.introduceYourself();
//    Animal cat       = new Animal("Cat", "Kurre");
//    Animal dog       = new Animal("Dog", "Vilma");
//    Animal bird      = new Animal("Bird", "Pippi");
//    Animal butterfly = new Animal("Butterfly", "Bella");
//
//    System.out.println("==== Djuren introducerar sig ====");
//    cat.introduceYourself();
//    dog.introduceYourself();
//    bird.introduceYourself();
//    butterfly.introduceYourself();

//    Animal[] allAnimals = new Animal[4];
//    allAnimals[0] = cat;
//    allAnimals[1] = dog;
//    allAnimals[2] = bird;
//    allAnimals[3] = butterfly;
//
//    System.out.println("==== Djuren gör sina ljud ====");
//    for (int i = 0; i < allAnimals.length ; i++) {
//      System.out.println(makeSound(allAnimals[i]));
//    }
//      
//    System.out.println("==== Djuren flyger (om de kan) ====");
//    for (int i = 0; i < allAnimals.length ; i++) {
//      fly(allAnimals[i]);
//    }

	}

}
