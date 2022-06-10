package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritingByColumnNumber {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("E:\\march automation\\Babu.xlsx");

		FileOutputStream fos = null;
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		
		XSSFFont font = wb.createFont();
		font.setFontName("Arial Black");
		font.setFontHeight(8.0);
		font.setBold(true);
		
		XSSFCellStyle style = wb.createCellStyle();
		
		style.setFont(font);
		
		XSSFRow row = sheet.getRow(2);
		
		XSSFCell cell = row.getCell(4);	
        cell.setCellStyle(style);
		
        cell.setCellValue("failed");
      
		fos = new FileOutputStream("C:\\Users\\Prem\\Desktop\\Babu.xlsx");
	
		wb.write(fos);
		
		wb.close();
		fos.close();
	
	}

}
