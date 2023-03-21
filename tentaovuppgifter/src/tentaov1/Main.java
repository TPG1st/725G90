package tentaov1;
 class Main {
	
	
	public static void main(String[] args) {
		Lamp DefaultLamp = new Lamp("10 Watts", "Medium", "Glass Lamp");
		DefaultLamp.print();
		Lamp GlassLamp= new CeilingLamp("10 Watts", "Medium", "Glass Lamp", 9);
		GlassLamp.print();
	}	
}
