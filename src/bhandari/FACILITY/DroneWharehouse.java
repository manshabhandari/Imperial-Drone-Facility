package bhandari.FACILITY;

import java.util.TreeMap;

import bhandari.CLASSES.ImperialDrone;

public class DroneWharehouse {

	private String whName;
	private String storeFilePath;
	private TreeMap<String, ImperialDrone> storageBin;
	
	public DroneWharehouse(String whName, String storeFilePath) {
		this.whName = whName;
		this.storeFilePath = storeFilePath;
	}
	
	public String getWhName() {
		return whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
	}

	public String getStoreFilePath() {
		return storeFilePath;
	}

	public void setStoreFilePath(String storeFilePath) {
		this.storeFilePath = storeFilePath;
	}

	public TreeMap<String, ImperialDrone> getStorageBin() {
		return storageBin;
	}

	public void setStorageBin(TreeMap<String, ImperialDrone> storageBin) {
		this.storageBin = storageBin;
	}

	public boolean persistStoreDrone() {
		return true;
	}
}
