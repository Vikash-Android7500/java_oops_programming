package THIS_Keyword;

public class THISkeyword {
     int power1;
     int power2;
     int power3;
     
     THISkeyword(int p1, int p2, int p3){
          this.power1 = p1;
          this.power2 = p2;
          this.power3 = p3;
     }

     double CounterValue(){
          return power1 + power2 + power3;
     }

    public static void constructors(){
          double add;
          double add2;
          THISkeyword skeyword = new THISkeyword(2, 3, 8);
          THISkeyword vkeyword = new THISkeyword(20,30, 740);
          add = skeyword.CounterValue();
          add2 = vkeyword.CounterValue();
          System.out.println("This Keyword".toUpperCase() + " \n" + add + "\n" + "second value" + " \n" + add2);
     }
}
