package backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VehicleReader {

	public static Vehicle createVehicle(String path) {
		String man=null, mo=null, vin=null, manufDate=null, taxBand=null, cost=null;
		try {
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			man = br.readLine();
			mo = br.readLine();
			vin = br.readLine();
			manufDate = br.readLine();
			taxBand = br.readLine();
			cost = br.readLine();
			br.close();
		} catch (IOException e) {
			System.err.println("ERROR in the reading file stream");
		}
		
		if (man==null || mo==null || vin==null ||
				manufDate==null || taxBand==null || cost==null)
			return null;
		else
			return new Vehicle(man, mo, vin, manufDate, taxBand.charAt(0), Float.parseFloat(cost));
		
	}
	
	public static File saveVehicle(Vehicle v, String path) {
		File res = null;
		try {
			res = new File(path);
			FileWriter fw = new FileWriter(res);
			fw.write(v.getManufacturer()+"\r\n");
			fw.write(v.getModel()+"\r\n");
			fw.write(v.getVid()+"\r\n");
			fw.write(v.getManufDate()+"\r\n");
			fw.write(v.getTaxBand()+"\r\n");
			fw.write(v.getCost()+"\r\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.err.println("ERROR in the writing file stream");
		}
		return res;
	}
	public static void main(String[] args) {
	       String pwd = System.getProperty("user.dir");
	       System.out.println(pwd);
	       
	       Vehicle v1 = VehicleReader.createVehicle(pwd+"\\vehicle1.txt");
	       System.out.println(v1);
	       
	       Vehicle v2 = new Vehicle("Renault", "Clio", "FZESF", "12 Avril 2010", 'B', 10000);
	       VehicleReader.saveVehicle(v2, pwd+"\\vehicle2.txt");
	  }

}
