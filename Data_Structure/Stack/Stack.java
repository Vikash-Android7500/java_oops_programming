package Data_Structure.Stack;
public class Stack {
     int[] stack = new int [10];
     int TOS;
     static char A;

     //Initialize top-of-stack constructor.
      Stack(){
          TOS = -1;
      }

     //push stack.
     void push(int item){
          if (TOS == 9) {
               System.out.println("stack is full.");
          }
          else{
               stack[++TOS] = item;
          }
     } 

     //pop stack.
     int pop(){
          if (TOS < 0) {
               System.out.println("Stack underflow");
               return 0;
          } else {
               return stack[TOS--];
          }
     }

    public static void ALL(){
          Stack s1 = new Stack();
          Stack s2 = new Stack();

          //push some number onto the stack.
          for(int i = 0; i < 10; i++) s1.push(i);
          for(int i = 10; i < 20; i++) s2.push(i);

          //pop those number off the stack.
          for(int i = 0; i < 10; i++)
          System.out.println(s1.pop());

          for (int i = 0; i < 10; i++)
          System.out.println(s2.pop());
     }
}