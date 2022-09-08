package Final_keyword;

public class F_1 {
     //This line Final keyword use in Static keyword anoder use Method.
     static final StringBuilder builder_1 = new StringBuilder("Final_1 ");
      

     public static void FInal_print(){
          final StringBuilder builder = new StringBuilder("Final_2 ");

          System.out.println(builder.append("Final_print method ke under StringBuilder "));

          System.out.println(builder_1.append("Static keyword use for final keyword  "));
     }
}
