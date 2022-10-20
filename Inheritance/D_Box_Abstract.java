package Inheritance;

public abstract class D_Box_Abstract {
     abstract void callme();

     void calltoo() {
          System.out.println("This is a concrete mathod.");
     }

     public static void RUN_PROGRAM() {
          Box_2 box_2 = new Box_2();
          box_2.callme();
          box_2.calltoo();
     }

}

class Box_2 extends D_Box_Abstract {
     void callme() {
          System.out.println("Box 2 is implimention of callme. ");
     }
}
