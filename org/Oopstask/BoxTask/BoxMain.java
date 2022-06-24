package com.org.Oopstask.BoxTask;

import com.org.Oopstask.BoxTask.Box;

public class BoxMain {
	public static void main(String[] args) {
		Box3d box3d=new Box3d(1, 2, 3);
		Box box=new Box(2, 2, 3);
		box.area();
		box.volume();
		box3d.area();
		box3d.volume();
	}
}
