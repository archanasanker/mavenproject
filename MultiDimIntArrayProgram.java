class MultiDimIntArrayProgram{

	
	public static void main(String args[]){
	int a[][] = {{30,5,10},{20,20,20}}; // row - 2 , column -3 
	
	for (int i=0; i<2 ; i++){
		for (int j=0; j<3; j++){
		System.out.print(a[i][j]+" ");

		}
         	System.out.println();        
	}
	
	
	

	}
}

/* int[2][3]

row- 2 (0,1) , column-3 (0,1,2)

30 5 10      00 01 02
20 20 20    10 11 12

*/