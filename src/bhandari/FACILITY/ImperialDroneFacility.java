package bhandari.FACILITY;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import bhandari.CLASSES.StrikeDrone;
import bhandari.DATA_GENERATOR.DroneDataGenerator;

public class ImperialDroneFacility {

	public static String storage = "C:\\Users\\mansh\\eclipse-workspace\\Bhandari_HW6\\src\\bhandari\\STORAGE\\DStore";
	private String facilityName;
	private DroneFactory facilityFactory;
	private DroneWharehouse facilityWharehouse;
	private DroneDataGenerator facilityGenerator;
	
	public ImperialDroneFacility(String facilityName, DroneFactory facilityFactory,
			DroneWharehouse facilityWharehouse, DroneDataGenerator facilityGenerator) {
		this.facilityName = facilityName;
		this.facilityFactory = facilityFactory;
		this.facilityWharehouse = facilityWharehouse;
		this.facilityGenerator = facilityGenerator;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public DroneFactory getFacilityFactory() {
		return facilityFactory;
	}

	public void setFacilityFactory(DroneFactory facilityFactory) {
		this.facilityFactory = facilityFactory;
	}

	public DroneWharehouse getFacilityWharehouse() {
		return facilityWharehouse;
	}

	public void setFacilityWharehouse(DroneWharehouse facilityWharehouse) {
		this.facilityWharehouse = facilityWharehouse;
	}

	public DroneDataGenerator getFacilityGenerator() {
		return facilityGenerator;
	}

	public void setFacilityGenerator(DroneDataGenerator facilityGenerator) {
		this.facilityGenerator = facilityGenerator;
	}
	
	public boolean ProduceAndStoreDrones(int count) {
		try {
			StrikeDrone S = new StrikeDrone("SD-100");
			ObjectOutputStream Sout = new ObjectOutputStream(new FileOutputStream(storage));
			Sout.writeObject(S);			
			Sout.flush();
			Sout.close();
			//System.out.println("Stormtrooper stored");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}
	
	
}
