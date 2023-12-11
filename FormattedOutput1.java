public class FormattedOutput1  
{  
  public static void main( String args[ ] )  
  {  
    // printing the string value on the console  
    String str = " JavaTpoint " ;  
    System.out.printf( " \n Printing the String value : %s \n ", str ) ; 
 
    // printing the integer value on the console  
    int x = 512 ;  
    System.out.printf( " \n Printing the integer value : x = %d \n ", x ) ;  

    // printing the decimal value on the console  
    float f = 5.25412368f ;  
    System.out.printf( " \n Printing the decimal value : %f \n ", f ) ;  

    // this formatting is used to specify the width un to which the digits can extend  
    System.out.printf( " \n Formatting the output to specific width : n = %.4f \n ", f ) ;  

    // this formatting will print it up to 2 decimal places  
    System.out.printf( " \n Formatted the output with precision : PI = %.2f \n ", f ) ; 
 
    // here number is formatted from right margin and occupies a width of 20 characters  
    System.out.printf( " \n Formatted to right margin : n = %20.4f \n ", f ) ;  
 
 }  
}  