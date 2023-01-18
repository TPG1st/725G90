
class Animal {

	private String name;
	private int birthyear;
	private static int currentYear;
	private Toy toy;
	private Animal friend;

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
		return currentYear - birthyear;

	}

	public String getName() {
		return name;
	}

	public void print() {
		if (friend != null) {

			System.out.println("Här är uppgifter om min kompis:");
			friend.introduceYourself();
		} else {
			System.out.println("Jag har ingen kompis.");
		}
	}

	public void addToy(Toy toy) {
		this.setToy(toy);
	}

	public void setFriend(Animal friend) {
		this.friend = friend;
	}

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}

}
