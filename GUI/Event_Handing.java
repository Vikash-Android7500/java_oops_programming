package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event_Handing {

     JLabel jLabel;

     Event_Handing() {

          JFrame frame = new JFrame("An Event Example");

          frame.setLayout(new FlowLayout());

          frame.setSize(500, 250);

          frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

          // Mack Button
          JButton button1 = new JButton("Best 1");
          JButton button2 = new JButton("Right 2");
          
          //Buttons if else Zero basic logic 
          int number_0 = 101;
          int number_1 = 100;
          int number1 = 200;
          int number2 = 100;
          boolean  b = number1 > number2;
          boolean  b_1 = number_0 < number_1;

          // Add Action Listener for button1
          button1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                    jLabel.setText("Best Click me btn 1".toUpperCase() + number_0 * number_1);


                    if (number_0 == number_1) {
                         System.out.println("number Value is Equals = " + number_0 + b_1);

                    } else if (number_0 != number_1) {
                         System.out.println("number2 Value is not Equals = " + number_1 + b_1);
                    } else {
                         System.out.println("Invalide");
                    }
               }
          });

          button2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                    jLabel.setText("Right Click me btn 2".toUpperCase());
                    if (number1 == number2) {
                         System.out.println("number Value is Equals = " + b);
                       
                    } else if (number1 != number2) {
                         System.out.println("number2 Value is not Equals = " + number2 + b);
                    } else {
                         System.out.println("Invalide");
                    }
               }
          });

          // Add the button to the content pane
          frame.add(button1);
          frame.add(button2);

          jLabel = new JLabel("Press a Button.");

          frame.add(jLabel);

          frame.setVisible(true);
     }

     public static void button_click() {
          SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                    new Event_Handing();
               }
          });
     }
}
