package Nested_Class;

public class Outer_2 {
     int outer_2 = 200;

     void test2() {
          for (int i = 0; i < 5; i++) {
               class Inner {
                    void Display(int outer_2) {
                         System.out.println("Diplay: Outer_2 = " + outer_2);
                    }
               }

               Inner inner = new Inner();
               System.out.println("_______________");
               inner.Display(200);
          }
     }

     public static void CLASS_print2() {
          Outer_2 outer_2 = new Outer_2();
          outer_2.test2();
     }
}
