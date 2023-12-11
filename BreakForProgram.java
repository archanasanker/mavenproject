class BreakForProgram{

	
	public static void main(String args[]){
	
	int a;
	for(a=50 ; a>=20 ; a--){
	
	if(a==45){
	continue;
	
	}
	System.out.println("Value ="+a);
 	}
	System.out.println("Outside for loop");

	}
}