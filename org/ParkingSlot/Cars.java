package com.org.ParkingSlot;

import java.util.HashMap;
import java.util.Iterator;

public class Cars {
	static HashMap<Integer,String> Car=new HashMap<>();
	static HashMap<Integer,String> filledCarsSlots=new HashMap<>();
	Cars(){
		Car.put( 1," Slot no");
		Car.put( 2," Slot no");
		Car.put( 3," Slot no");
		Car.put( 4," Slot no");
		Car.put( 5," Slot no");
		Car.put( 6," Slot no");
		Car.put( 7," Slot no");
		Car.put( 8," Slot no");
		Car.put( 9," Slot no");
		Car.put( 10," Slot no");
		Car.put( 11," Slot no");
		Car.put( 12," Slot no");
		Car.put( 13," Slot no");
		Car.put( 14," Slot no");
		Car.put( 15," Slot no");

	}
	public void availableSlotsForCars() {
		Iterator itr=Car.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void carSlots(int slotno,String name) {
		if(Car.containsKey(slotno)) {
			System.out.println("The slot is succesfully Booked..Thankyou");
			filledCarsSlots.put(slotno,name);
			Car.remove(slotno);
		}
		else {
			System.out.println("The slot is already Booked");
		}
	}
}
