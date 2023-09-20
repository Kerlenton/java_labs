package ru.mirea.lab5.task3;

import javax.swing.*;
import java.awt.*;

public class ImageWindow extends JFrame {
    private ImageIcon image;

    public ImageWindow(String imagePath) {
        image = new ImageIcon(imagePath);

        setTitle("Image Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(image.getIconWidth(), image.getIconHeight());
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image.getImage(), 0, 0, null);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the path to an image as a command line argument.");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            ImageWindow imageWindow = new ImageWindow(args[0]);
            imageWindow.setVisible(true);
        });
    }
}
