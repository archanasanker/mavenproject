class MultiDimStringArrayProgram{

	
	public static void main(String args[]){
	String Department[][] = {{"IT","HR","FINANCE"},{"DEV","QA","DEV-Ops"}}; // row - 2 , column -3 
	
	for (int i=0; i<2 ; i++){
		for (int j=0; j<3; j++){
		System.out.print(Department[i][j]+" ");

		}
         	System.out.println();        
	}
	
	
	

	}
}

