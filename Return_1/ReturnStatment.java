package Return_1;

public class ReturnStatment {
     static short Number = 0;

      static int[] newArrey(int one, int Two, int Three, int Four, int Five){
          int [] arr = new int[5];
          arr[0] = one;
          arr[1] = Two;
          arr[2] = Three;
          arr[3] = Four;
          arr[4] = Five;
          return arr;
     }

    public static void arrDiplay(){
          int[] ARR = newArrey(5, 4, 3, 2, 1);

          System.out.println("////// Return Statment");

         for (int i : ARR) { //ForEach Loop.
          for(int line = 0; line < 1; line++){ //ForLoop.
               System.out.println(" ____________");
          }
           System.out.println(Number++ +  "  " + i);
         }
        
     }
}