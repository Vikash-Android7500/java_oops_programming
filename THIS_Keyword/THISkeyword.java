package THIS_Keyword;

public class THISkeyword {

     static int power1;
     int power2;
     int power3;
     
     THISkeyword(int p1, int p2, int p3){
          THISkeyword.power1 = p1;
          this.power2 = p2;
          this.power3 = p3;
     }

     double CounterValue(){
          return power1 * power2 * power3;
     }

    public static void constructors(){
          double add;
          double add2;
       THISkeyword skeyword = new THISkeyword(50, 60, 70);
       THISkeyword vkeyword = new THISkeyword(20,30, 740);
         add = skeyword.CounterValue();
         add2 = vkeyword.CounterValue();
         System.out.println(" \n" + add + "\n" + "second value" + " \n" + add2);
     }
}
