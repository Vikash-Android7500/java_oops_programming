package Getter_Setter;

//Getter Setter
public class difference {
     int one;
     public int Two;
     private int Three;

     void setTHREE(int item){
          Three = item;
     }

     int getTHREE(){
          return Three;
     }

     public static void SET_get(){
         difference DD = new difference();
         DD.one = 10;
         DD.Two = 20;
         DD.setTHREE(100);
         System.out.println("\n" + "one " + DD.one + " Two " + DD.Two + " Three " + DD.getTHREE() );
     }
}
