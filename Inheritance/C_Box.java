package Inheritance;

//super class
public class C_Box {
     double width;
     double height;
     double depth;

     // Constructor's
     C_Box(C_Box ob) {
          width = ob.width;
          height = ob.height;
          depth = ob.depth;
     }

     C_Box(double w, double h, double d) {
          width = w;
          height = h;
          depth = d;
     }

     C_Box() {
          width = -1;
          height = -1;
          depth = -1;
     }

     C_Box(double len) {
          width = height = depth = len;
     }

     // Return Constructor
     double volume() {
          return width * height * depth;
     }

     // Run Program.
     public static void Box_Run() {
          BoxWeight boxWeight1 = new BoxWeight(10, 20, 15, 34.3);
          BoxWeight boxWeight2 = new BoxWeight(2, 3, 4, 0.076);
          double vol;
          vol = boxWeight1.volume();
          System.out.println("\n" + "Volume of boxWeight1 is " + vol);
          System.out.println("Volume of boxWeight1 is " + boxWeight1.weight);
          System.out.println("-----------------------------------");

          vol = boxWeight2.volume();
          System.out.println("Volume of boxWeight2 is " + vol);
          System.out.println("Volume of boxWeight2 is " + boxWeight2.weight);
     }
}

// Chaild class to extends Box class
class BoxWeight extends C_Box {
     double weight;

     BoxWeight(double w, double h, double d, double m) {
          width = w;
          height = h;
          depth = d;
          weight = m;
     }
}
