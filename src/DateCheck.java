import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;


public class DateCheck {

	public static final SimpleDateFormat simpleDateTimeFormatFromService = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss aaa");
	
	public static final int[][] DAY_PARTS = new int[][] { { 21600, 35999, 1 }, { 36000, 57599, 2 }, { 57600, 68399, 3 }, { 68400, 107999, 4 } };
	
	public static void main(String[] args){
		
		String baseEndDate = "Jan 1, 1970 12:00:00 AM";
		
		
		String userEndDate="Jan 1, 1970 12:00:00 AM";
		try {
			Date date = simpleDateTimeFormatFromService.parse(userEndDate);
			System.out.println(date);
			System.out.println(new Date(0));
			if(date.equals(new Date(0)) ||baseEndDate.equals(userEndDate)){
				System.out.println("1970 date");
				date=new Date();
				System.out.println(date);
			}else{
				System.out.println("Not 1970 date");
			}
	
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static Date addSeconds(Date date,Integer seconds){
		DateTime dateTime=new DateTime(date);
    	dateTime=dateTime.plusSeconds(seconds);
		return dateTime.toDate();
	}
	
}
