class RelationalOperatorPgm {
  public static void main(String[] args) {
    
    // create variables
    int a = 7, b = 11;

    // value of a and b
    System.out.println("a is " + a + " and b is " + b);

    // == operator
    System.out.println("Value of a == b is " +(a== b));  // false

    // != operator
    System.out.println("Value of a != b is " +(a != b));  // true

    // > operator
    System.out.println("Value of a > b is " +(a > b));  // false

    // < operator
    System.out.println("Value of a < b is " +(a < b));  // true

    // >= operator
    System.out.println("Value of a >= b is " +(a >= b));  // false

    // <= operator
    System.out.println("Value of a <= b is " +(a <= b));  // true
  }
}