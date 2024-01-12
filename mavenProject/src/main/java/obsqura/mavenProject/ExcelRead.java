package obsqura.mavenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static String readString(int i, int j) throws IOException
	{
		f = new FileInputStream("/Users/saijug/Java Programs Shortcut/Java/mavenProject/emp.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();		
	}

	public static double readNumeric(int i, int j) throws IOException 
	{
		f = new FileInputStream("/Users/saijug/Java Programs Shortcut/Java/mavenProject/emp.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getNumericCellValue();		
	}	
}