package Encapsulationg;

//Getter Setter
public class SimpleGetterAndSetter {
    private int number;

    public int getNumber() {
        return this.number;
    }
 
    public void setNumber(int num) {
        this.number = num;
    }

    public static void SET_GET(){
     SimpleGetterAndSetter andSetter = new SimpleGetterAndSetter();
     andSetter.number = 10;
     int num = andSetter.number; 

     andSetter.setNumber(10); // OK
     num = andSetter.getNumber(); // fine

     System.out.println("\n" + "GET SET  " + num);
    }
}
