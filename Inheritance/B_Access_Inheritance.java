package Inheritance;

public class B_Access_Inheritance {

     // Supar Class
     int i;
     protected int j;

     void setij(int x, int y) {
          i = x;
          j = y;
     }

     // Run program.
     public static void Access_Inheritance_run() {
          second subOb = new second();
          subOb.setij(10, 20);
          subOb.sum();
          System.out.println("total is " + subOb.total);
     }

}

// Chaild Class in extends to Access_Inhritance
class second extends B_Access_Inheritance {
     int total;

     void sum() {
          total = i + j;
     }

}
