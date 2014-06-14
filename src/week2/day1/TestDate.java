package week2.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date parsedDate = sdf.parse("12/05/2000 13:22");
		System.out.println(parsedDate);
		
		String formmatedDate = sdf.format(parsedDate);
		System.out.println(formmatedDate);
		
		
		Date date = new Date();
		System.out.println(date);
		
		
		

	}

}
