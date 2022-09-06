package overloading;

public class Overloading_Constructors {
     double width;
     double height;
     double depth;
     
     Overloading_Constructors(double w, double h, double d){
          width = w;
          height = h;
          depth = d;
     }

     Overloading_Constructors(){
          width = -1;
          height = -1;
          depth = -1;
     }

     Overloading_Constructors(double Len){
          width = height = depth = Len;
     }

     double volume() {
          System.out.println("------------------");
          return width * height * depth;
     }

    

     // All Constructors Call.
    public static void all_overloading_constructors(){
          Overloading_Constructors constructors_1 = new Overloading_Constructors(10, 20, 15);
          Overloading_Constructors constructors_2 = new Overloading_Constructors();
          Overloading_Constructors constructors_3 = new Overloading_Constructors(7);
          
          //varible
          double vol;
          vol = constructors_1.volume();
          System.out.println("box 1 " + vol);
          vol = constructors_2.volume();
          System.out.println("box 2 " + vol);
          vol = constructors_3.volume();
          System.out.println("box 3 " + vol);
     }
}