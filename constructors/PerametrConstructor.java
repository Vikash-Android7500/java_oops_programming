package constructors;

public class PerametrConstructor {
     double width;
     double height;
     double depth;


     PerametrConstructor(double w, double h, double d){
          System.out.println("\n" + "---------" + "This PerametrConstructor ");
          width = w;
          height = h;
          depth = d;
     }

     double volume() {
          System.out.println("Return Statment.");
          return width * height * depth;
     }
     
     // Constructor Parameters call.
    public static void Pera() {
          PerametrConstructor P1 = new PerametrConstructor(40, 40, 40);
          PerametrConstructor P2 = new PerametrConstructor(12, 12, 12);
         
          double vol;
          int vol2;
          vol = P1.volume();
          vol2 = (int) P2.volume();
          System.out.println(" Pera 1 is " + vol + "\n" + " Pera 2 is " + vol2);

     }
}
