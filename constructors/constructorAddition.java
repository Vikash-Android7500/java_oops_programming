package constructors;

public class constructorAddition {
     int item_0;
     int item_1;
     int item_2;
     
     constructorAddition(int i_0, int i_1, int i_2){
         item_0 = i_0;
         item_1 = i_1;
         item_2 = i_2;
     }

     float Addition(){
          return item_0 + item_1 + item_2;
     }

     public static void ADD_Constructors(){
          constructorAddition addition_0 = new constructorAddition(10, 20, 25);
          constructorAddition addition_1 = new constructorAddition(50, 60, 65);
          constructorAddition addition_2 = new constructorAddition(70, 80, 86);

          float ADD_0;
          float ADD_1;
          float ADD_2;
          ADD_0 = addition_0.Addition();
          ADD_1 = addition_1.Addition();
          ADD_2 = addition_2.Addition();

          System.out.println("\n" + "Addition one = " + ADD_0 + " \n" + "Addition Two = " + ADD_1 + "\n" + "Addition Three = " + ADD_2);
          
     }
}
