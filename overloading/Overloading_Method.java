package overloading;

public class Overloading_Method {
     void test(double item0, double item1, double item2 ){
          System.out.println("patten ".toLowerCase());
          
          for (int i = 0; i <= item0; i++) {
               for (int j = 0; j <= i; j++) {
                    System.out.print(" * ");
               }
               // Adition if else
               if (item0 < item1) {
                    item2 = item0 + item1;
               } else {
                    item0 = (item1 + item2) * 5;
               }
               System.out.println();
               System.out.println();
          }

         
          
     }

     void test(int item1){
          System.out.println("Use for parameter ".toUpperCase() + item1);
     }

     void test(int item1, int item2){
          System.out.println("use for tow parameters ".toUpperCase() + item1 + " \t" + item2);
     }

     double test(double item1){
          System.out.println("use double data tayp add ".toUpperCase() + item1);
          return item1 * item1;
     }

    public static void overloading_method(){
          Overloading_Method method = new Overloading_Method();
          double resualt;
          //call all variables of test.
          method.test(4, 5, 5);
          method.test(10);
          method.test(20, 30);
          resualt = method.test(125.50);
          System.out.println("resualt of double variable for use ".toUpperCase() + resualt);
          
     }
}
