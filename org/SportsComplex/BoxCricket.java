package com.org.SportsComplex;

import java.util.HashMap;
import java.util.Iterator;

public class BoxCricket {
	static HashMap<Integer,String> boxCricketslots=new HashMap<>() ;
	static  HashMap<Integer,String>boxCricketfilledSlots=new HashMap<>();
	BoxCricket(){
		boxCricketslots.put(1, "1:00-3:00");
		boxCricketslots.put(2, "3:00-5:00");
		boxCricketslots.put(3, "5:00-7:00");
		boxCricketslots.put(4, "7:00-9:00");
		boxCricketslots.put(5, "9:00-11:00");
	}
	public void availableSlotsForCricket() {
		Iterator itr=boxCricketslots.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void boxCricketSlots(int slotno,String name) {
		if(boxCricketslots.containsKey(slotno)) {
			System.out.println("The slot is succesfully Booked..");
			boxCricketfilledSlots.put(slotno,name);
			boxCricketslots.remove(slotno);
		}
		else {
			System.out.println("The slot is already Booked..choose Another");
		}
	}
}
