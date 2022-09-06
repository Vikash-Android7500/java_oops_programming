package DSA.Recursion;

//Recusion 2
public class Rec_Test {
    static int[] values;

    //Constructor
     Rec_Test (int Rec_item){
          values = new int[Rec_item];
     }

    void PRINT_ARRARY_2(int Rec_item){
          if(Rec_item == 0) return;
          else PRINT_ARRARY_2(Rec_item - 1);
          System.out.println("[" + (Rec_item - 1) + "] " + values[Rec_item - 1]);
     }

     public static void Recursion_arrary_print(){
          Rec_Test test = new Rec_Test(10);
                    int item;
          for(item = 0; item < 10; item++) Rec_Test.values[item] = item;
          
          test.PRINT_ARRARY_2(10);
     }

}
