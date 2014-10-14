package backend;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SerializeVehicle {
	
	public static Vehicle createVehicle(String path) {
		String man=null, mo=null, vin=null, manufDate=null;
		char taxBand=(char) -1;
		float cost=-1.0f;
		try {
			File file = new File(path);
			DataInputStream br = new DataInputStream(new FileInputStream(file));
			man = br.readUTF();
			mo = br.readUTF();
			vin = br.readUTF();
			manufDate = br.readUTF();
			taxBand = br.readChar();
			cost = br.readFloat();
			br.close();
		} catch (IOException e) {
			System.err.println("ERROR in the reading file stream");
		}
		
		if (man==null || mo==null || vin==null ||
				manufDate==null || taxBand==(char) -1 || cost==-1.0f)
			return null;
		else
			return new Vehicle(man, mo, vin, manufDate, taxBand, cost);
		
	}

	public static File saveVehicle(Vehicle v, String path) {
		File res = null;
		try {
			res = new File(path);
			DataOutputStream fw = new DataOutputStream(new FileOutputStream(res));
			fw.writeUTF(v.getManufacturer());
			fw.writeUTF(v.getModel());
			fw.writeUTF(v.getVid());
			fw.writeUTF(v.getManufDate());
			fw.writeChar(v.getTaxBand());
			fw.writeFloat(v.getCost());
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
	       
	       Vehicle v2 = new Vehicle("Renault", "Clio", "FZESF", "12 Avril 2010", 'B', 10000);
	       SerializeVehicle.saveVehicle(v2, pwd+"\\vehicle3.txt");
	       
	       Vehicle v1 = SerializeVehicle.createVehicle(pwd+"\\vehicle3.txt");
	       System.out.println(v1);
	       
	       
	}
}
