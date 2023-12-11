public class ConstructorExample1 {  // class

int num;
String str;
float fl;

ConstructorExample1(){ // creating constructor
System.out.println("Constructor called.");
fl=8;
}

public static void main(String args[]){
//constructor call
ConstructorExample1 obj1 = new ConstructorExample1();

//print default values of object properties.

System.out.println("num = " + obj1.num);
System.out.println("str = " + obj1.str);
System.out.println("fl = " + obj1.fl);
}
}
