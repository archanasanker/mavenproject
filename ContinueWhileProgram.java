class ContinueWhileProgram{

	
	public static void main(String args[]){
	
	int num=10;
	while (num>=1){
	if(num==6){
	num--;
	continue;
	}
	System.out.println("num ="+num);
	num--;
	}

	}
}