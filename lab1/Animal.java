class Animal {
  private String name;
  private int birthyear;
  private static int currentYear;

  Animal(String name, int age) {
    this.name = name;
    this.birthyear = currentYear - age;
  }

  void introduceYourself() {
    System.out.println("Jag är ett djur som heter " + name + ".");
    System.out.println("Jag är " + birthyear + " år gammal");
  }

  String makeSound() {
    return ""; // ???
  }
  
  void fly() {
    // ???
  }
  public static void setYear(int year) {
	  currentYear = year;
  }
  public int getBirthyear() {
	  return currentYear-birthyear;
	 
  }
  public String getName() {
	  return name;
  }

}
