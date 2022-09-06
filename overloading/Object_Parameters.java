package overloading;

public class Object_Parameters {
    private int item_1;
    private  int item_2;
    static short line = 0;

     //Parameters Constructor
     Object_Parameters(int box_1, int box_2){
          item_1 = box_1;
          item_2 = box_2;
     }

     //Return true if o is equal to the invoking object.
     boolean equalTO(Object_Parameters OBJECT){
          if (OBJECT.item_1 == item_1 && OBJECT.item_2 == item_2) return true;

          else return false;
     }

     //ALll Objects Display information.
     public static void PRINT_OBJECT_PARAMENTERS(){
          Object_Parameters  object_Parameters1 = new Object_Parameters(100, 22);
          Object_Parameters  object_Parameters2 = new Object_Parameters(100, 22);
          Object_Parameters  object_Parameters3 = new Object_Parameters(-1, -1);

          System.out.println("\n");
          System.out.println(++line + " object_Parameters1 == object_parameters2:  " + object_Parameters1.equalTO(object_Parameters2));
          System.out.println(++line + " object_Parameters1 == object_Parameters3:  " + object_Parameters1.equalTO(object_Parameters3));
     }
}
