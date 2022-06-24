package com.org.SportsComplex;

import java.util.HashMap;
import java.util.Iterator;

public class FootBall {
	static HashMap<Integer,String> footBallslots=new HashMap<Integer,String>() ;
	static HashMap<Integer,String>footBallsfilledSlots=new HashMap<Integer,String>();
	FootBall(){
		footBallslots.put(1, "9:00-9:30");
		footBallslots.put(2, "9:30-10:00");
		footBallslots.put(3, "10:00-10:30");
		footBallslots.put(4, "10:30-11:00");
		footBallslots.put(5, "11:00-11:30");
		footBallslots.put(6, "11:30-12:00");
		footBallslots.put(7, "12:00-12:30");
		footBallslots.put(8, "12:30-1:00");
		footBallslots.put(9, "1:00-1:30");
		footBallslots.put(10, "1:30-2:00");
		footBallslots.put(11, "2:00-2:30");
		footBallslots.put(12, "2:30-3:00");
		footBallslots.put(13, "3:00-3:30");
		footBallslots.put(14, "3:30-4:00");
		footBallslots.put(15, "4:00-4:30");
		footBallslots.put(16, "4:30-5:00");
		footBallslots.put(17, "5:00-5:30");
		footBallslots.put(18, "5:30-6:00");
		footBallslots.put(19, "6:00-6:30");
		footBallslots.put(20, "6:30-7:00");
	}
	public void availableslotsForFootBall() {
		Iterator itr=footBallslots.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void footBallSlots(int slotno,String name) {
		if(footBallslots.containsKey(slotno)) {
			System.out.println("The slot is succesfully Booked..");
			footBallsfilledSlots.put(slotno,name);
			footBallslots.remove(slotno);
		}
		else {
			System.out.println("The slot is already Booked..choose Another");
		}
	}
}
