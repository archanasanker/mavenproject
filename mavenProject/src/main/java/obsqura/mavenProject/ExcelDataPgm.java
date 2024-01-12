package obsqura.mavenProject;
//  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
    import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	public class ExcelDataPgm {
	    	public static void main(String[] args) {
	        try {
	            // Specify the path to your Excel file (.xls format)
	            String excelFilePath = "/Users/saijug/Java Programs Shortcut/Java/mavenProject/emp1.xls";
	            //("/Users/saijug/Desktop")

	            // Create a FileInputStream to read the Excel file
	            FileInputStream fis = new FileInputStream(new File(excelFilePath));

	            // Create an HSSFWorkbook instance
	            Workbook workbook = new XSSFWorkbook(fis);

	            // Get the first sheet from the workbook
	            Sheet sheet = workbook.getSheetAt(0);

	            // Iterate through each row in the sheet
	            for (Row row : sheet) {
	                // Iterate through each cell in the row
	            for (Cell cell : row) {
	                    // Print the cell value
	                    System.out.print(cell.toString() + "\t");
	                }
	                System.out.println(); // Move to the next line after each row
	            }

	            // Close the workbook and FileInputStream
	            
	            workbook.close();
	            fis.close();
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



