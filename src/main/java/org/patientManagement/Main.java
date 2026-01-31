package org.patientManagement;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create main window (JFrame)
            JFrame frame = new JFrame("Minimal Swing App");

            // Optional: set default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Add a simple label
            JLabel label = new JLabel("Hello, Swing + Java 17!", SwingConstants.CENTER);
            label.setPreferredSize(new Dimension(300, 100));
            frame.getContentPane().add(label);

            // Pack components and center the window
            frame.pack();
            frame.setLocationRelativeTo(null);

            // Show the window
            frame.setVisible(true);
        });
    }
}