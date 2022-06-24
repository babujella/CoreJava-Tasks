package com.org.ParkingSlot;

import java.util.HashMap;
import java.util.Iterator;

public class Bikes {
	static HashMap<Integer,String> Bike=new HashMap<>();
	static HashMap<Integer,String> filledBikeSlots=new HashMap<>();
	Bikes(){
		Bike.put(1,"-Slot no");
		Bike.put(2,"-Slot no");
		Bike.put(3,"-Slot no");
		Bike.put(4,"-Slot no");
		Bike.put(5,"-Slot no");
		Bike.put(6,"-Slot no");
		Bike.put(7,"-Slot no");
		Bike.put(8,"-Slot no");
		Bike.put(9,"-Slot no");
		Bike.put(10,"-Slot no");
		Bike.put(11,"-Slot no");
		Bike.put(12,"-Slot no");
		Bike.put(13,"-Slot no");
		Bike.put(14,"-Slot no");
		Bike.put(15,"-Slot no");
	}
	public void availableSlotsForBikes() {
		Iterator itr=Bike.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}}
	public void bikeSlots(int slotno,String name) {
		if(Bike.containsKey(slotno)) {
			System.out.println("The slot is succesfully Booked.. Thankyou");
			filledBikeSlots.put(slotno, name);
			Bike.remove(slotno);
		}
		else {
			System.out.println("The slot is already booked..");
		}
	}
}
