class StringArrayProgram{

	
	public static void main(String args[]){

	String name[]=new String[5];
	name[0]="Renu";
	name[1]="Richu";
	name[2]="Jay";
	name[3]="Manu";
	name[4]="Archa";
	System.out.println("Array length" + name.length);
	
		for(int i=0; i<name.length ; i++){
		System.out.println("Name ["+i+"] - " +name[i]);
		}
	
	
	
	}
}