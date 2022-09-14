package Nested_Class;

//Outer Class
public class Outer {
     int outer_1 = 100;

     void Test() {
          Inner inner = new Inner();
          inner.Display(100);
     }

     //Inner Class 
     public class Inner {
          void Display(int i) {
               System.out.println("Display: outer_1 Inner Class = " + i);
          }
     }

     public static void CLASS_P2() {
          Outer outer = new Outer();
          System.out.println("\n" + "Outer Fist Program");
          outer.Test();
     }

}

