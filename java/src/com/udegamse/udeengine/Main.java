package com.udegamse.udeengine;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main extends JFrame implements Runnable {

    Thread thread;
    Panel panel;
    Renderer renderer;
    Boolean running;
    final double UPDATE_CAP = 1.0/60.0;

    public Main(String title) {
        panel = new Panel(this);
        renderer = new Renderer(panel);

        add(panel);
        setVisible(true);
        setResizable(true);
        setSize(getToolkit().getScreenSize());
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        thread = new Thread(this);
        thread.run();
    }

    public void run() {
        running = true;

        boolean render = false;
        double firstTime = 0;
        double lastTime = System.nanoTime() / 1000000000.0;
        double passedTime = 0;
        double unprocessedTime = 0;

        double frameTime = 0;
        int frames = 0;
        int fps = 0;

        while(running) {
            render = false;

            firstTime = System.nanoTime() / 1000000000.0;
            passedTime = firstTime - lastTime;
            lastTime = firstTime;

            unprocessedTime += passedTime;
            frameTime += passedTime;

            while (unprocessedTime >= UPDATE_CAP) {
                unprocessedTime -= UPDATE_CAP;
                render = true;

                if(frameTime >= 1.0) {
                    frameTime = 0;
                    fps = frames;
                    frames = 0;
                    System.out.println(fps);
                }
            }

            if(render) {
                panel.clear();
                try {
                    renderer.drawImage(ImageIO.read(new File(getClass().getResource("/test.png").toURI())), 0, 0);
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
                frames++;
            }
            else {
                try {
                    Thread.sleep(1);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        dispose();
    }

    public static void main(String[] args) {
        Main engine = new Main("Title");
    }
}
