package overloading;

public class Overloading_Method_2 {
     
    void test(){
          System.out.println("No Parameters");
     }

     void test(String textview1, String textview2){
         System.out.println(textview1 + "\t" + textview2);
     }

     void test(int imageview1, int imageview2, int imageview3, int imageview4){
          System.out.println("all imageviews Parameters ".toUpperCase() + "\t" + imageview1 + " " + imageview2 + " " + imageview3 + " " + imageview4);
     }
    
      // call all variables of test Method.
     public static void Test2(){
          Overloading_Method_2 method_2 = new Overloading_Method_2();
          method_2.test();
          method_2.test("TextView1", "TextView2");
          method_2.test(0, 1, 2, 3);
     }

}
