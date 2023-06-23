package bhandari.FACILITY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import bhandari.CLASSES.ImperialDrone;

public class DroneFactory {

	private String facName;
	private String dataFilePath;
	private String cleanDataFile;
	
	public DroneFactory(String facName, String dataFilePath, String cleanDataFile) {
		this.facName = facName;
		this.dataFilePath = dataFilePath;
		this.cleanDataFile = cleanDataFile;
	}

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public String getDataFilePath() {
		return dataFilePath;
	}

	public void setDataFilePath(String dataFilePath) {
		this.dataFilePath = dataFilePath;
	}

	public String getCleanDataFile() {
		return cleanDataFile;
	}

	public void setCleanDataFile(String cleanDataFile) {
		this.cleanDataFile = cleanDataFile;
	}
	
	public void cleanDataFile() throws IOException {
		String reading = "src\\bhandari\\DATA\\DroneData";
		BufferedReader BR = new BufferedReader(new FileReader(reading));
		String line = "";
		int x = 1;
		int index = 0;
		String[] cleaning = new String[300];

		while((line = BR.readLine()) != null) {
			cleaning[index] = line;
			index++;															
		}
		
		BR.close();
		
		String[] trial = new String[cleaning.length];
		for(int i = 0; i < cleaning.length; i++) {
			String[] plswork = cleaning[i].split(",");
			
			String please = "";
			for(int j = 0; j < plswork.length; j++) {
				if(j%2 == 0) {
					if((j == 2) || (j == 4)){
						please += plswork[j] + " ";
					} else {
						please += plswork[j];
					}
				}
			}
			trial[i] = please;
		}	
		/*
		for(int k = 0; k < trial.length; k++) {
			System.out.println(trial[k]);
		}
		*/
		
		String writing = "src\\bhandari\\DATA\\CleanDroneData";
		BufferedWriter BW = new BufferedWriter(new FileWriter(writing));
		
		for(int a = 0; a < trial.length; a++) {
			BW.write(trial[a] + "\n");
		}
		BW.close();
	}

	public TreeMap< String, ImperialDrone> manufactureDrones() throws IOException {
		
		TreeMap<String, ImperialDrone> manufactureDrones = new TreeMap<>();
		return manufactureDrones;
	}
}
