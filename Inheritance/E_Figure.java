package Inheritance;

public abstract class E_Figure {
     double dim_1;
     double dim_2;

     E_Figure(double a, double b){
          dim_1 = a;
          dim_2 = b;
     }

     abstract double area();

     public static void RUN_FIGRURE(){
          // E_Figure  e_Figure = new E_Figure(10, 50);
          Rectangle rectangle = new Rectangle(5, 5);
          Triangle triangle = new Triangle(10, 8);
          E_Figure e_Figure;
          e_Figure = rectangle;
          System.out.println("Area is " + e_Figure.area());
          e_Figure = triangle;
          System.out.println("Area is " + e_Figure.area());

               
     
     }

}

class Rectangle extends E_Figure{
     Rectangle(double a, double b) {
          super(a, b);
          
     }

     double area(){
          System.out.println("inside Area for Rectangle. ");
          return dim_1 * dim_2;
     }
}

class Triangle extends E_Figure{
     Triangle(double a, double b){
          super(a, b); 
     }

     // override area for right triangle
     double area(){
          System.out.println("Inside Area for Trinagle. ");
          return dim_1 * dim_2 / 2;
     }

}
