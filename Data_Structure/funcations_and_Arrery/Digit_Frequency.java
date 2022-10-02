package Data_Structure.funcations_and_Arrery;

import java.util.Scanner;

public class Digit_Frequency {
     

     public static void Digit_run() {
          try (Scanner scn = new Scanner(System.in)) {
               System.out.println("First Digit write Number 994543234 ");
               int n = scn.nextInt();
               System.out.println("Second Digit write Number 4 ");
               int d = scn.nextInt();
               int f = getDigitFrequency(n, d);
               System.out.println("your Digit Resualt 3 = " + f);
              
          }
     }

     static int getDigitFrequency(int n, int d){
           int rv = 0;
           while (n > 0) {
               int dig = n % 10;
               n = n / 10;

               if (dig == d) {
                    rv++;
               }
           }
           return rv;
     }
}
