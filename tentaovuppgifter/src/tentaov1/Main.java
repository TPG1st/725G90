package tentaov1;

public class Main {

	Lamp GlassLamp = new CeilingLamp("10 Watts", "Medium", "GlassLamp");
	
	public void print() {
	System.out.println("Följande djur finns i huset:");
	}
	public static void main(String[] args) {
		print(CeilingLamp);
	}
	
	
	
}
