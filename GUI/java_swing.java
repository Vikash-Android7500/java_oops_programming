package GUI;

import javax.swing.*;

public class java_swing {

    java_swing() {
        // Create a new JFrame
        JFrame frame = new JFrame("java simple swing application use for swing ".toUpperCase());
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Swing means powerfull GUI. Program".toUpperCase());
        frame.add(jLabel);

        frame.setVisible(true);
    }

    public static void run_program() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new java_swing();
            }

        });
    }
}
