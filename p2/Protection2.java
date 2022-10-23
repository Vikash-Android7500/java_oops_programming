package p2;

import p1.Protection;

public class Protection2 extends p1.Protection {
     Protection2(){
          System.out.println("Derived Other Package Constroctor ");
          //class or Package only.
          // System.out.println("n_1 = " + n);
          // class only
          // System.out.println("n-private = " + n_pari);
          System.out.println("n_protected = " + n_pro);
          System.out.println("n_public = " + n_pub);
          System.out.println();
     }

     public static void package_Run_2(){
          Protection2 ob1 = new Protection2();
          OtherPackage ob2 = new OtherPackage();
          System.out.println(ob1 + "\n" + "\n" + ob2 );
     }
}

class OtherPackage{
     OtherPackage(){
          p1.Protection p = new Protection();
          System.out.println("other Package Contructor ");
          // System.out.println("n_1 = " + p.n);
          // class only
          // System.out.println("n-private = " + p.n_pari);
          //class subClass or Package only. 
          // System.out.println("n_protected = " + p.n_pro);
          System.out.println("n_public = " + p.n_pub);
          System.out.println();
     }
}

