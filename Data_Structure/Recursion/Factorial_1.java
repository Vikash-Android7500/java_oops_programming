package Data_Structure.Recursion;

//Recusion 1
public class Factorial_1 {
    
    static double factorial(Double number){

     if (number == 0 || number == 1)
            return 1;
            
        return number * factorial(number - 1);
    }
    
    //print of Factorial's
    public static void recursion(){

         int Anser0 = (int) factorial((double) 0);
         int Anser1 = (int) factorial((double) 1);
         int Anser2 = (int) factorial((double) 2);
         int Anser3 = (int) factorial((double) 3);
         int Anser4 = (int) factorial((double) 4);
         int Anser5 = (int) factorial((double) 5);

         // Print and display the factorial of number
         // customly passed as an argument
        
             System.out.println("Factorial of 0 is :" + Anser0);
             System.out.println("Factorial of 1 is :" + Anser1);
             System.out.println("Factorial of 2 is :" + Anser2);
             System.out.println("Factorial of 3 is :" + Anser3);
             System.out.println("Factorial of 4 is :" + Anser4);
             System.out.println("Factorial of 5 is :" + Anser5);
             
    }

}

