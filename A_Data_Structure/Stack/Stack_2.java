package A_Data_Structure.Stack;

public class Stack_2 {
     private int[] stack = new int [10]; 
     private int tos;

     //Initialize top-of-stack
     Stack_2(){
          tos = -1;
     }

     //push an item onto the stack
     void push(int item){
          if (tos == 9)
          System.out.println("Stack is full ");
          else{
               stack[++tos] = item;
             
          }
     }

     //pop an item from the stack 
     int pop(){
          if(tos < 0){
          System.out.println("Stack underflow ");
          return 0;
          }
          else{
               return stack[tos--];
          }
     }

     public static void stack2_print(){
          Stack_2  mystack1 = new Stack_2();
          Stack_2  mystack2 = new Stack_2();
          
          //push some numbers onto the stack
          for(int i = 0; i < 10; i++) mystack1.push(i);
          for(int i = 10; i < 20; i++) mystack2.push(i);

          //pop those numbers off the stack 
          System.out.println("\n" + "Stack in mystack1 = ");
          for(int i = 0; i < 10; i++)
          System.out.println(mystack1.pop());
          
          System.out.println("Stack in mystack2 = ");
          for(int i = 0; i < 10; i++)
          System.out.println(mystack2.pop());
          
     }
}
