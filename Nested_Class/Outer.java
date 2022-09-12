package Nested_Class;

public class Outer {
     int outer_1 = 100;

     void Test() {
          Inner inner = new Inner();
          inner.Display(100);
     }

     public static void CLASS_P2() {
          Outer outer = new Outer();
          System.out.println("\n" + "Outer Fist Program");
          outer.Test();
     }

}
