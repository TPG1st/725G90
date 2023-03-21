package tentaov1;

public class CeilingLamp extends Lamp{
	
	private int HangLength;

	public CeilingLamp(String PowerConsumption, String Brightness, String LampName) {
		super(PowerConsumption, Brightness, LampName);
		
	}
    public CeilingLamp(String PowerConsumption, String Brightness, String LampName, int LampPrice) {
    	super(PowerConsumption, Brightness, LampName);
    	this.LampName = LampName;
        this.Brightness = Brightness;
        this.PowerConsumption = Brightness;
        this.LampPrice = LampPrice;
    }
    @Override
    public  void print() {
		System.out.println("Name of the ceiling lamp is " + getLampName() + ". It has a power consumption of " + getLampPowerConsumption() + "and its brightness level is " + getLampBrightness() + ".");
	}
}
