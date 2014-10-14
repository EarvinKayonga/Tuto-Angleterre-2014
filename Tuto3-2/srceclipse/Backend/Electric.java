package Backend;

import java.util.Date;

public class Electric extends Vehicle2 {

	private int range;
	private String batteryType;
	public Electric(String ma, String mo, String vin, Date maDate, char t, float f, int i, String s) {
		super(ma, mo, vin, maDate, t, f);
		range = i;
		batteryType = s;
	}

	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getBatteryType() {
		return batteryType;
	}
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	public String toString() {
		return super.toString()+"Electric [range=" + range + ", batteryType=" + batteryType
				+ "]";
	}
	
	
}
