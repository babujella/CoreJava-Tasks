package com.org.FilesIO;

public class EmployeeMain {
	public static void main(String[] args) throws Exception {
		Employee employee =new Employee();
		Manager manager=new Manager();
		employee.create();
		employee.write();
		employee.read();
		manager.write();
		manager.read();
	}
}