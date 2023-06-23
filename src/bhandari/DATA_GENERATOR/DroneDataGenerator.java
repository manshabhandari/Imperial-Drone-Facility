package bhandari.DATA_GENERATOR;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DroneDataGenerator {
	
	Random R = new Random();
	public static String storage = "src\\bhandari\\DATA\\DroneData";

	private String genName;
	private String storeDirectory;
	private String storeFile;
	
	public DroneDataGenerator(String genName, String storeDirectory, String storeFile) {
		this.genName = genName;
		this.storeDirectory = storeDirectory;
		this.storeFile = storeFile;
	}

	public String getGenName() {
		return genName;
	}

	public void setGenName(String genName) {
		this.genName = genName;
	}

	public String getStoreDirectory() {
		return storeDirectory;
	}

	public void setStoreDirectory(String storeDirectory) {
		this.storeDirectory = storeDirectory;
	}

	public String getStoreFile() {
		return storeFile;
	}

	public void setStoreFile(String storeFile) {
		this.storeFile = storeFile;
	}

	public String generateAssaultDroneString(int sn, int code, int value) {
    	int rID = R.nextInt(value) + 1;
    	String droneID = "AD-" + rID;

    	int rCode = R.nextInt(1000);
    	String droneCode = "AS-" + rCode;

    	int rADV = R.nextInt(1000);
    	String droneADV = "A0" + rADV;

    	//"Assault Drone, Drone ID:," + droneID +

    	return ",Assault Code:," + droneCode + ",ADV:," + droneADV;
	}

	public String generateStrikeDroneString(int sn, int code, int value) {
    	int rID = R.nextInt(value) + 1;
    	String droneID = "SD-" + rID;

    	int rCode = R.nextInt(1000);
    	String droneCode = "SS-" + rCode;

    	int rSDV = R.nextInt(1000);
    	String droneSDV = "S0" + rSDV;

    	//"Strike Drone, Drone ID:," + droneID +

    	return ",Strike Code:," + droneCode + ",SDV:," + droneSDV;
	}

	public String generateReconDroneString(int sn, int code, int value) {
    	int rID = R.nextInt(value) + 1;
    	String droneID = "RD-" + rID;

    	int rCode = R.nextInt(1000);
    	String droneCode = "RS-" + rCode;

    	int rRDV = R.nextInt(1000);
    	String droneRDV = "R0" + rRDV;

    	//"Recon Drone, Drone ID:," + droneID +

    	return ",Recon Code:," + droneCode + ",RDV:," + droneRDV;
	}
	
	public void generateDroneData(int count) throws IOException {
		String fn = storage;
		BufferedWriter BW = new BufferedWriter(new FileWriter(fn));
		String[] attempt = {"Write1", "Write2"};
		
		//Generating an array for the Assault Code
		String[] assaultArray = new String[count];
		String[] strikeArray = new String[count];
		String[] reconArray = new String[count];
		
		int k = 1;
		for(int i = 0; i < count; i++) {
			String assault = "Assault Drone, Drone ID:, AD-" + k + generateAssaultDroneString(0, 0, count); 
			assaultArray[i] = assault;
			
			String strike = "Strike Drone, Drone ID:, SD-" + k + generateStrikeDroneString(0, 0, count); 
			strikeArray[i] = strike;
			
			String recon = "Recon Drone, Drone ID:, RD-" + k + generateReconDroneString(0, 0, count); 
			reconArray[i] = recon;
			
			k++;
		}
		
		int j = 0;		
		while(j < assaultArray.length) {
			BW.write(assaultArray[j] + "\n");
			BW.write(strikeArray[j] + "\n");
			BW.write(reconArray[j] + "\n");
			j++;
		}
		
		BW.close();
	}
}
