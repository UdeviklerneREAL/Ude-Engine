package com.udegames.udeEngine;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Window {
    private JFrame frame;
    private BufferedImage image;
    private Canvas canvas;
    private BufferStrategy bs;
    private Graphics g;

    public Window(Engine engine) {
        image = new BufferedImage(engine.width, engine.height, BufferedImage.TYPE_INT_RGB);
        canvas = new Canvas();
        Dimension s = new Dimension((int)(engine.width * engine.scale), (int)(engine.height * engine.scale));
        canvas.setPreferredSize(s);
        canvas.setMaximumSize(s);
        canvas.setMinimumSize(s);

        frame = new JFrame(engine.title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        canvas.createBufferStrategy(2);
        bs = canvas.getBufferStrategy();
        g = bs.getDrawGraphics();
    }

    public void update() {
        g.drawImage(image,0, 0, canvas.getWidth(), canvas.getHeight(), null);
        bs.show();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public BufferedImage getImage() {
        return image;
    }

    public JFrame getFrame() {
        return frame;
    }

    public Graphics getG() {
        return g;
    }
}
