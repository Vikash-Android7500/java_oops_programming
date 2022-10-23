package p1;

public class Protection {
      int n = 1;
     private int n_pari = 2;
     protected int n_pro = 3; 
     public int n_pub = 4;

     public Protection(){
          System.out.println("BAse constructor");
          System.out.println("n_1 = " + n);
          System.out.println("n-private = " + n_pari);
          System.out.println("n_protected = " + n_pro);
          System.out.println("n_public = " + n_pub);
          System.out.println();
     }

     public static void package_Run(){
          Protection ob1 = new Protection();
          Derived ob2 = new Derived();
          p1.SamePackege ob3Packege = new SamePackege();
          System.out.println(ob1 + "\n" + ob2 + "\n" + ob3Packege);
     }
}

// Derived class
class Derived extends Protection{
     Derived(){
          System.out.println("Derived constructor");
          System.out.println("n = " + n);
          // System.out.println("n-private = " 4 + n_pari);
          System.out.println("n_protected = " + n_pro);
          System.out.println("n_public = " + n_pub);
          System.out.println();
     }
}
//SamePackege 
class SamePackege {

     SamePackege() {
          Protection p = new Protection();
          System.out.println("Derived constructor");
          System.out.println("n = " + p.n);
          // System.out.println("n-private = " 4 + p.n_pari);
          System.out.println("n_protected = " + p.n_pro);
          System.out.println("n_public = " + p.n_pub);
          System.out.println();
     }
}
