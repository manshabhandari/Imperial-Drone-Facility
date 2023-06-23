package bhandari.INTERFACES;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

import bhandari.CLASSES.ImperialDrone;
import bhandari.CLASSES.StrikeDrone;
	

public interface DroneOperations {
	public static final String dir = "src\\bhandari\\STORAGE\\DStore";
	public static final String dir2 = "src\\bhandari\\DATA\\DroneData";
	
	public default void storeDrone(String filename) {
		try {
			StrikeDrone S = new StrikeDrone("SD-100");
			ObjectOutputStream Sout = new ObjectOutputStream(new FileOutputStream(dir, true));
			Sout.writeObject(S);			
			Sout.flush();
			Sout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static ImperialDrone retriveDrone(String filename) {
		StrikeDrone S = null;
		try {
			ObjectInputStream Sin = new ObjectInputStream(new FileInputStream(dir));
			S = (StrikeDrone)Sin.readObject();
			//Sin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return S;
	}
	
	public static TreeMap<String, ImperialDrone> buildAllDrones(String filename){
		return null;
	}
}
