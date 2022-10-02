package Data_Structure;

public class fibonacciNumber{
  static int Number = 5;
  
  // Recursion Problam Solving.
  static int fibonacci_number(int Number) {
       if (Number == 0 || Number == 1) {
          System.out.println("This Value is: " + Number);

          for(int line = 0; line < 1; line++){
            System.out.println("~~~~~~~~~~~~~~~~");
          }
            return Number;
       }
       return fibonacci_number(Number - 2) + fibonacci_number(Number - 2);
  }

  public static void display(){
    System.out.println("/////// Fibonacci Number");
   
     System.out.println(fibonacci_number(Number));
  }
}