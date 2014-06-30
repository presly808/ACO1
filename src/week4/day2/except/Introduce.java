package week4.day2.except;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Introduce {

	public static void main(String[] args) throws ParseException {
		action2("gh:12");
		System.out.println("after parsing");

	}
	
	public static Date action(String line) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM");
		Date res = sdf.parse(line);
		return res;
	}
	
	public static Date action2(String line) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM");
		Date res = null;
		try {
			res = sdf.parse(line);
		} catch (ParseException pe) {
			System.out.println(pe.getMessage());
		}
		
		return res;
	}

	
}
