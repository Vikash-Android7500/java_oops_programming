package overloading;

public class Overloading_Method {
     void test(){
          System.out.println("no paramiters".toLowerCase());
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
          method.test();
          method.test(10);
          method.test(20, 30);
          resualt = method.test(125.50);
          System.out.println("resualt of double variable for use ".toUpperCase() + resualt);
          
     }
}
