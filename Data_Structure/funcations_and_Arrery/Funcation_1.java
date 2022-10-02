package Data_Structure.funcations_and_Arrery;

import java.util.Scanner;

public class Funcation_1 {
     

     public static void Funcation_run(){
          try (Scanner scn = new Scanner(System.in)) {
               System.out.println("First Number ");
               int n = scn.nextInt();
               System.out.println("Second Number ");
               int r = scn.nextInt();

               int nfact = fact(n);
               int nmrfact = fact(n - r);
               
               int npr = nfact / nmrfact;
               display(n, r, npr);
          }
     }

     //Return funcation
     static int fact(int x){
          int rv = 1;

          for(int i = 1; i <= x; i++){
               rv = rv * i;
          }
          return rv;
     }

     //funcation in Display
     static void display(int n, int r, int npr){
          System.out.println("This Resualt ".toUpperCase());
          System.out.println(n + " p ".toUpperCase() + r + " = " + npr);
     }
}
