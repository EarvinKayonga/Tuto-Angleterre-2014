package Backend;

import java.util.Date;

public class Hybrid extends Vehicle2 {

	private double consumption;
	private String drive;
	
	public Hybrid(String ma, String mo, String vin, Date maDate, char t, float f, double d, String s) {
		super(ma, mo, vin, maDate, t, f);
		consumption = d;
		drive = s;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	@Override
	public String toString() {
		return super.toString()+"Hybrid [consumption=" + consumption + ", drive=" + drive + "]";
	}
	
	
}
