package bhandari.CLASSES;

import java.text.DecimalFormat;

import bhandari.ENUMS.Engine;
import bhandari.ENUMS.Fuselage;
import bhandari.ENUMS.Wing;

public class StrikeDrone extends ImperialDrone {

	private static final long serialVersionUID = 1L;
	
	DecimalFormat DF = new DecimalFormat("#,###.00");
	
	
	
	private String strikeCode;
	private String SDV;

	public StrikeDrone(String droneID) {
		super(droneID, "Strike");
		this.setFuselage(Fuselage.StrikeFuselage);
		this.setEngine(Engine.StrikeEngine);
		this.setWings(Wing.StrikeWing);
		this.strikeCode = null;
		this.SDV = null;
		
	}

	public String getStrikeCode() {
		return strikeCode;
	}

	public void setStrikeCode(String strikeCode) {
		this.strikeCode = strikeCode;
	}

	public String getSDV() {
		return SDV;
	}

	public void setSDV(String sDV) {
		SDV = sDV;
	}

	@Override
	public String toString() {
		return "StrikeDrone [strikeCode=" + strikeCode + ", SDV=" + SDV + "]";
	}
	
	@Override
	public void displayDroneSpecs() {
		System.out.println("____STRIKE DRONE____");
		System.out.println("droneID: " + getDroneID());
		System.out.println("Drone Type: " + getDroneType());
		System.out.println("Fuselage:");
		System.out.println("\t" + "Fuselage Type: " + Fuselage.StrikeFuselage.getFuselageType() + " Fuselage Length: " + DF.format(Fuselage.StrikeFuselage.getFuselageLength()) +  " Fuselage Cost: " + DF.format(Fuselage.StrikeFuselage.getFuselageCost()));
		System.out.println("Wings:");
		System.out.println("\t" + "Wing Type: " + Wing.StrikeWing.getWingType() + " Wing Length: " + DF.format(Wing.StrikeWing.getWingLength()) + " Wing Cost: " + DF.format(Wing.StrikeWing.getWingCost()));
		System.out.println("Engine:");
		System.out.println("\t" + "Engine Type: " + Engine.StrikeEngine.getEngineType() + " Engine HP: " + DF.format(Engine.StrikeEngine.getEngineHP()) + " Engine Cost: " + DF.format(Engine.StrikeEngine.getEngineCost()));
	}
	
	
}
