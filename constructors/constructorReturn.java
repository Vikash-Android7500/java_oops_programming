package constructors;

public class constructorReturn{
     double width;
     double height;
     double depth;



     constructorReturn(){
          System.out.println("\n" + "---------" + "This constructors ");
          width = 10;
          height = 10;
          depth = 10;
     }

     double volume(){
          System.out.println("Return Statment.");
          return width * height * depth;
     }

     //Construtor Variable call.
     public static void multi(){
          constructorReturn C = new constructorReturn();
          constructorReturn D = new constructorReturn();

          double vol;
          int vol2;
          vol = C.volume();
          vol2 = (int) D.volume();
          System.out.println(" Object 1 = " + vol + "\n" + " Object 2 = " + vol2);
          
     }
     
}