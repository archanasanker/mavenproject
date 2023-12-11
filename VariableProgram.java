class VariableProgram{

int a=10; // non-static  or instance variable
static int b; //static variable
static Integer c; // non-primitive

public static void main(String args[]){

//System.out.println(a);  // can't call a non-static (instance variable) Inside a static method directly
	
System.out.println(b); // can call static variable inside static method and primitive has a default value

System.out.println(c); // non-primitive don't have default variable

VariableProgram vp=new VariableProgram(); //creating object for the class <ClassName objectname=new ClassName();>
System.out.println(vp.a); // non-static variable can be called to a static method by creating object.

int d=20; //local variable should be initialised
System.out.println(d);

//static int e=30; Can't use static variable inside methods --error shown-error: class, interface, enum, or record expected
//System.out.println(e);

vp.a=20;
System.out.println(vp.a);

}}



