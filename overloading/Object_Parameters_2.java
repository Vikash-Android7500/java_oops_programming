package overloading;

public class Object_Parameters_2 {
     double width;
     double height;
     double depth;

     // इस कंस्ट्रक्टर पर ध्यान दें, यह Obect_Paramenter_2 type प्रकार का ऑब्जेक्ट
     // लेता है.
     Object_Parameters_2(Object_Parameters_2 OB){
          width = OB.width;
          height = OB.height;
          depth = OB.depth;
     }
         
     Object_Parameters_2(double w, double h, double d){
          width = w;
          height = h;
          depth = d;
     }
     
     Object_Parameters_2(){
          width = -1;
          height = -1;
          depth = -1;
     }
     // Constructor use when Cube is created.
     // Cube बनाते समय कंस्ट्रक्टर का उपयोग।
     Object_Parameters_2(double Leanth){
          width = height = depth = Leanth;
     }
      //Return
     double volume(){
          return width * height *depth;
     }

     public static void OBJECT_2(){
          Object_Parameters_2 parameters_1 = new Object_Parameters_2(10, 20, 30);
          Object_Parameters_2 parameters_2 = new Object_Parameters_2();
          Object_Parameters_2 myCube = new Object_Parameters_2(7);
          Object_Parameters_2 myClone = new Object_Parameters_2(parameters_1);
          double Resualt;
          
          Resualt = parameters_1.volume();
          System.out.println("Resualt 1 = " + Resualt);

          Resualt = parameters_2.volume();
          System.out.println("Resualt 2 = " + Resualt);

          Resualt = myCube.volume();
          System.out.println("Resualt 3 = " + Resualt);

          Resualt = myClone.volume();
          System.out.println("My Clone = " + Resualt);

     }
     
}
