package constructors;

public class constructorS {
      String Name1 = "";
      int Age;


     constructorS(String N, int A){
          Name1 = N;
          Age = A;
     }

      //Constructor Variable call
     public static void VIEW(){
          constructorS C = new constructorS("vikash", 25);

          for (int two = 0; two < 1; two++) {
               System.out.println("\n" + "/////Constructor");
               System.out.println(C.Name1 + "\n" + C.Age);
             

          }
     }

     
}
