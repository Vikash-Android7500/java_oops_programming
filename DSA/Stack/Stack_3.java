package DSA.Stack;
                               //Program Date = 9/09/2022
public class Stack_3 {
     private int[] stck;
     private int tos;

     //initialize stack 
     Stack_3(int size){
         stck = new int[size];
         tos = -1;
     }

     //push item
     void push(int item){
          if (tos == stck.length -1) 
               System.out.println("Stack is full");
          else
          stck[++tos] = item;
     }

     //pop item
     int pop(){
          if(tos < 0){
               System.out.println("Stack in Underflow ");
               return 0;
          }
          else
          return stck[tos--];
     }

     public static void Test_stack_3(){
          Stack_3  mystack_1 = new Stack_3(20);
          Stack_3  mystack_2 = new Stack_3(8);

          //push numbers.
          for(int i = 0; i < 20; i++) mystack_1.push(i);
          for(int i = 0; i < 8; i++) mystack_2.push(i);

          //pop numbers off the stack.
          System.out.println("Stack in myStack_1 = ");
          for(int i = 0; i < 20; i++) 
          System.out.println(mystack_1.pop());

          System.out.println("Stack in myStack_2 = ");
          for (int i = 0; i < 8; i++)
          System.out.println(mystack_2.pop());
     }
}
