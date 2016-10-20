import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;









import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;


public class DateUtil {

	public static final int[][] DAY_PARTS = new int[][] { { 21600, 35999, 1 }, { 36000, 57599, 2 }, { 57600, 68399, 3 }, { 68400, 107999, 4 } };
	
	
	public static void main(String[] arg){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date dt= simpleDateFormat.parse("05/05/2016");
			System.out.println(dt);
			
			DateTime jodaDt=new DateTime(dt);
			
			System.out.println(jodaDt);
			System.out.println(jodaDt.toDate());
			
			System.out.println(addSeconds(dt,DAY_PARTS[(int)1-1][0]));			  
			
			Date returnDate=addSeconds(dt,DAY_PARTS[(int)1-1][0]);
			
			
			XSSFWorkbook wb = new XSSFWorkbook();
	        XSSFSheet sheet = wb.createSheet("Performance");  

	        XSSFDataFormat fmt = wb.createDataFormat();
	        
	        XSSFCellStyle dateTime = wb.createCellStyle();
	    	dateTime.setAlignment(XSSFCellStyle.ALIGN_LEFT);
	    	dateTime.setDataFormat(fmt.getFormat("dd/mm/yy hh:mm:ss"));
	        
	    	sheet.autoSizeColumn(0);
	    	
	        XSSFRow row = sheet.createRow(0);
        	
	        XSSFCell cell = row.createCell(1);
			cell.setCellStyle(dateTime);
			cell.setCellValue(returnDate);
			
			File file=new File("D:\\tmp\\1234.xlsx");
			
			 FileOutputStream fileOut;
				try {
					fileOut = new FileOutputStream(file);
					wb.write(fileOut);
			        fileOut.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		
		DateTime dateTime=new DateTime(date);
		
		System.out.println(dateTime.toLocalDateTime());*/
	}
	
	
	public static Date addSeconds(Date date,Integer seconds){
		DateTime dateTime=new DateTime(date);
    	dateTime=dateTime.plusSeconds(seconds);
		return dateTime.toDate();
	}
	
}
