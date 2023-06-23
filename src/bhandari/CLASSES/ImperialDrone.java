package bhandari.CLASSES;

import java.io.Serializable;

import bhandari.ENUMS.*;
import bhandari.INTERFACES.DroneOperations;

public abstract class ImperialDrone implements Serializable, DroneOperations {

	private static final long serialVersionUID = 1L;
	
	private String droneID;
	private String droneType;
	private Fuselage fuselage;
	private Wing wings;
	private Engine engine;
	
	public ImperialDrone(String droneID, String droneType) {
		super();
		this.droneID = droneID;
		this.droneType = droneType;
	}

	public String getDroneID() {
		return droneID;
	}

	public void setDroneID(String droneID) {
		this.droneID = droneID;
	}

	public String getDroneType() {
		return droneType;
	}

	public void setDroneType(String droneType) {
		this.droneType = droneType;
	}

	public Fuselage getFuselage() {
		return fuselage;
	}

	public void setFuselage(Fuselage fuselage) {
		this.fuselage = fuselage;
	}

	public Wing getWings() {
		return wings;
	}

	public void setWings(Wing wings) {
		this.wings = wings;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void displayDroneSpecs() {
		System.out.println("Drone ID:" + droneID);
		System.out.println("Drone Type" + droneType);
	}

	@Override
	public String toString() {
		return "ImperialDrone [droneID=" + droneID + ", droneType=" + droneType + 
				", fuselage=" + fuselage + ", wings=" + wings + ", engine=" + engine + "]";
	}
	
	
	

}
