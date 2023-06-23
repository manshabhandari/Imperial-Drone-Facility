package bhandari.MAIN;

import java.io.IOException;

import bhandari.CLASSES.ImperialDrone;
import bhandari.DATA_GENERATOR.DroneDataGenerator;
import bhandari.FACILITY.*;
import bhandari.INTERFACES.DroneOperations;

public class Mansha {

	public static void main(String[] args) throws IOException {
		
		//Build Drone Data Generator
		DroneDataGenerator DG = new DroneDataGenerator("Bhandari1", DroneOperations.dir2,"DroneData");
		DG.generateDroneData(100);
		
		//Build Drone Factory
		DroneFactory DF = new DroneFactory("Bhandari_FAC", DroneOperations.dir2 + "DroneData", DroneOperations.dir2 + "CleanDroneData");
		DF.cleanDataFile();
		
		//Build Drone Warehouse
		DroneWharehouse DWH = new DroneWharehouse("Bhandari_WH", DroneOperations.dir2 + "DStore");
	
		//Build Imperial Drone Facility
		ImperialDroneFacility IDF = new ImperialDroneFacility("Bhandari_IDF", DF, DWH, DG);
		
		//Build and Store Drones
		IDF.ProduceAndStoreDrones(100);
		
		ImperialDrone ID = DroneOperations.retriveDrone(IDF.getFacilityWharehouse().getStoreFilePath());
		ID.displayDroneSpecs();
	}
}
