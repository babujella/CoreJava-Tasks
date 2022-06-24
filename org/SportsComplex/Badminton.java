package com.org.SportsComplex;

import java.util.HashMap;
import java.util.Iterator;

public class Badminton {
	static HashMap<Integer,String> badmintonSlots=new HashMap<>();
	static HashMap<Integer,String>BadmintonfilledSlots=new HashMap<>();
	Badminton(){
		badmintonSlots.put(1, "10:00 - 11:00");
		badmintonSlots.put(2," 11:00 - 12:00");
		badmintonSlots.put(3, "12:00 - 13:00");
		badmintonSlots.put(4, "13:00 - 14:00");
		badmintonSlots.put(5, "14:00 - 15:00");
		badmintonSlots.put(6, "15:00 - 16:00");
		badmintonSlots.put(7, "16:00 - 17:00");
		badmintonSlots.put(8, "17:00 - 18:00");
		badmintonSlots.put(9, "18:00 - 19:00");
		badmintonSlots.put(10, "19:00 - 20:00");
	}
	public void availableslotsForBadminton() {
		Iterator itr=badmintonSlots.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void badmintonSlots(int slotno,String name) {
		if(badmintonSlots.containsKey(slotno)) {
			System.out.println("The slot is succesfully Booked..");
			BadmintonfilledSlots.put(slotno,name);
			badmintonSlots.remove(slotno);
		}
		else {
			System.out.println("The slot is already Booked..choose Another");
		}
	}
}

