package bhandari.CLASSES;

import bhandari.ENUMS.Engine;
import bhandari.ENUMS.Fuselage;
import bhandari.ENUMS.Wing;

public class AssaultDrone extends ImperialDrone{

	private static final long serialVersionUID = 1L;
	
	private String assaultCode;
	private String ADV;

	public AssaultDrone(String droneID) {
		super(droneID, "Assault");
		this.setFuselage(Fuselage.AssaultFuselage);
		this.setEngine(Engine.AssaultEngine);
		this.setWings(Wing.AssaultWing);
		this.assaultCode = null;
		this.ADV = null;
	}

	public String getAssaultCode() {
		return assaultCode;
	}

	public void setAssaultCode(String assaultCode) {
		this.assaultCode = assaultCode;
	}

	public String getADV() {
		return ADV;
	}

	public void setADV(String aDV) {
		ADV = aDV;
	}
	
	@Override
	public void displayDroneSpecs() {
		System.out.println("*****************************");
		System.out.println("Drone ID: " + getDroneID());
		System.out.println("Drone Type: " + getDroneType());
		System.out.println("Fuselage Type: " + Fuselage.AssaultFuselage.getFuselageType() + "Fuselage Length: " + Fuselage.AssaultFuselage.getFuselageLength() +  "Cost: " + Fuselage.AssaultFuselage.getFuselageCost());
		System.out.println("Wing Type: " + Wing.AssaultWing.getWingType() + "Wing Length: " + Wing.AssaultWing.getWingLength() + "Wing Cost: " + Wing.AssaultWing.getWingCost());
		System.out.println("Engine Type: " + Engine.AssaultEngine.getEngineType() + "Engine HP: " + Engine.AssaultEngine.getEngineHP() + "Engine Cost: " + Engine.AssaultEngine.getEngineCost());
	}

	@Override
	public String toString() {
		return "AssaultDrone [assaultCode=" + assaultCode + ", ADV=" + ADV + "]";
	}
	
}
