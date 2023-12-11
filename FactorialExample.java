class FactorialExample{  

    findFactorial(){
         int i,fact=1;  
         int number=5;  
  for(i=1;i<=number;i++){    
      fact=fact*i;  
    }}
    displayFactorial(){
        System.out.println("Factorial of "+number+" is: "+fact);   
    }
 public static void main(String args[]){  
    findFactorial(5);
    displayFactorial();
   
  }    
   
 }  
 