package week7.adapter;

import java.util.Scanner;

class TestAdapter {
	public static void main(String[] args) {
		OldEmployee oldEmployee = new OldEmployee();
		OldEmpleeAdapter adapter = new OldEmpleeAdapter();
		adapter.setOldEmployee(oldEmployee);
		
		ModernCompany modernCompany = new ModernCompany();
		modernCompany.checkModernWorker(adapter);
		
		
		Scanner sc = new Scanner(System.in);
		
	}
}