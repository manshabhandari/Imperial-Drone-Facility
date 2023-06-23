package bhandari.CLASSES;

import bhandari.ENUMS.*;

public class ReconDrone extends ImperialDrone {

	private static final long serialVersionUID = 1L;
	
	private String reconCode;
	private String RDV;

	public ReconDrone(String droneID) {
		super(droneID, "Recon");
		this.setFuselage(Fuselage.ReconFuselage);
		this.setEngine(Engine.ReconEngine);
		this.setWings(Wing.ReconWing);
		this.reconCode = null;
		this.RDV = null;
	}
	
	
	public String getReconCode() {
		return reconCode;
	}

	public void setReconCode(String reconCode) {
		this.reconCode = reconCode;
	}

	public String getRDV() {
		return RDV;
	}

	public void setRDV(String rDV) {
		RDV = rDV;
	}

	@Override
	public String toString() {
		return "ReconDrone [reconCode=" + reconCode + ", RDV=" + RDV + "]";
	}
	
	@Override
	public void displayDroneSpecs() {
		System.out.println("*****************************");
		System.out.println("Drone ID: " + getDroneID());
		System.out.println("Drone Type: " + getDroneType());
		System.out.println("Fuselage Type: " + Fuselage.ReconFuselage.getFuselageType() + "Fuselage Length: " + Fuselage.ReconFuselage.getFuselageLength() +  "Cost: " + Fuselage.ReconFuselage.getFuselageCost());
		System.out.println("Wing Type: " + Wing.ReconWing.getWingType() + "Wing Length: " + Wing.ReconWing.getWingLength() + "Wing Cost: " + Wing.ReconWing.getWingCost());
		System.out.println("Engine Type: " + Engine.ReconEngine.getEngineType() + "Engine HP: " + Engine.ReconEngine.getEngineHP() + "Engine Cost: " + Engine.ReconEngine.getEngineCost());
	}
}
