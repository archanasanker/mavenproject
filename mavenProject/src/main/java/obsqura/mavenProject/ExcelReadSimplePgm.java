package obsqura.mavenProject;


	
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class ExcelReadSimplePgm {
	public static void main(String[] args) {
	        
		    String filePath = "/Users/saijug/Java Programs Shortcut/Java/mavenProject/emp.xlsx";
	        // ("users\\saijug\\Desktop\\Emp.xlsx");
	        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

	       try {
	            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
	            // Your file reading code here
	            System.out.println("Test for GIT repository commit");
	        } 
	       
	       catch (FileNotFoundException e) {
	            e.printStackTrace();
	            System.out.println("File not found. Please check the file path.");
	        }
	    }
	}



