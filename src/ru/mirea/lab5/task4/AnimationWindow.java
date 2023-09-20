package ru.mirea.lab5.task4;

import javax.swing.*;
import java.awt.*;

public class AnimationWindow extends JFrame {
    private ImageIcon[] frames;
    private int currentFrame;

    public AnimationWindow(ImageIcon[] frames) {
        this.frames = frames;
        this.currentFrame = 0;

        setTitle("Animation Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(frames[0].getIconWidth(), frames[0].getIconHeight());
        setLocationRelativeTo(null);

        Timer timer = new Timer(100, e -> {
            currentFrame = (currentFrame + 1) % frames.length;
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        frames[currentFrame].paintIcon(this, g, 0, 0);
    }

    public static void main(String[] args) {
        // Загрузка кадров анимации изображения
        ImageIcon[] frames = new ImageIcon[5];
        for (int i = 0; i < 5; i++) {
            frames[i] = new ImageIcon("frame" + i + ".png");
        }

        SwingUtilities.invokeLater(() -> {
            AnimationWindow animationWindow = new AnimationWindow(frames);
            animationWindow.setVisible(true);
        });
    }
}
