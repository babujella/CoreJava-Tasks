package com.org.ParkingSlot;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ConvertToFile {
	public void saveFile() throws IOException {
		PrintWriter obj=new PrintWriter(new File("D:\\NewFile\\NewFile.txt"));
		obj.println(Bikes.filledBikeSlots);
		obj.println(Cars.filledCarsSlots);
		obj.close();
	}
}
