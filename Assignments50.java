package assignments;

import java.util.Date;

public class Assignments50 {

	public static void main(String[] args) {
		
		Date d1= new Date();
		long l1 = d1.getTime();
		System.out.println(l1);
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String d3 = d2.toString();
		String day = d3.substring(0, 3);
		System.out.println(day);
		String month = d3.substring(4, 7);
		System.out.println(month);
		String year = d3.substring(d3.length()-4);
		System.out.println(year);
		String date = d3.substring(8, 10);
		System.out.println(date);
		
		String dateformat= date.concat(month).concat(year);
		System.out.println(dateformat);
		
	}
}
