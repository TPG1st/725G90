package tentaov1;

public class Lamp {
	String LampName;
	String Brightness;
	String PowerConsumption;
	int LampPrice;

	public Lamp(String PowerConsumption, String Brightness, String LampName){
       this.LampName = LampName;
       this.Brightness = Brightness;
       this.PowerConsumption = Brightness;
	}
	
	public String getLampName() {
		return LampName;
	}
	public String getLampBrightness() {
		return Brightness;
	}
	public String getLampPowerConsumption() {
		return PowerConsumption;
	}
	public int getLampPrice() {
		return LampPrice;
	}
	public  void print() {
		System.out.println("There is a lamp named " + getLampName() + ". It has a power consumption of " + getLampPowerConsumption() + "and its brightness level is " + getLampBrightness() + ".");
	}
}
