package week4.day2.gc;

import java.util.Scanner;

import week4.day1.fina.AtomicStation;

public class TestGar {
	
	public static void main(String[] args) {
		AtomicStation atomicStation = new AtomicStation(55);
		AtomicStation at = atomicStation;
		Scanner sc = new Scanner(System.in);
		
		while (true){
			System.out.println("Input action");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				atomicStation = null;
				System.gc();
				break;
				
			default:

				break;
			}
		}
	}
}
