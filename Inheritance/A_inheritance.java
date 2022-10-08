package Inheritance;

//Date > 14/09/2022
//super Class
public class A_inheritance {
     int one;
     int two;

     void show() {
          System.out.println("one   and  two: Parent Class  " + one + " " + two);
     }

     // Run Program.
     public static void inheritancePrint() {
          A_inheritance A = new A_inheritance();
          Inheritance2 B = new Inheritance2();

          A.one = 10;
          A.two = 20;
          System.out.println("Contents of super object: A  ");
          A.show();
          System.out.println("\n");

          B.one = 7;
          B.two = 8;
          B.five = 9;
          System.out.println("Contents of sub object: B  ");
          B.show();
          B.showFIVE();
          System.out.println("\n");

          System.out.println("sum of one, two and five in sub Object: ");
          B.sum();
     }

}

// chaild Class Extends to inheritance_1
class Inheritance2 extends A_inheritance {
     int five;

     void showFIVE() {
          System.out.println("Five " + five);
     }

     void sum() {
          System.out.println("one two and five all addition value " + (one + two + five));
     }

}
