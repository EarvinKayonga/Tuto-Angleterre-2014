package Backend;

import java.util.Date;

public class InternalCombustion extends Vehicle2 {

	private double consumption;
	
	public InternalCombustion(String ma, String mo, String vin, Date maDate, char t, float f, double c) {
		super(ma, mo, vin, maDate, t, f);
		consumption = c;
	}
	
	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public String toString() {
		return super.toString()+"InternalCombustion [consumption=" + consumption + "]";
	}
	
}
