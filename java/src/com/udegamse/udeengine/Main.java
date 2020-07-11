package com.udegamse.udeengine;

import javax.swing.*;

public class Main extends JFrame implements Runnable {

    Thread thread;
    Panel frame;

    public Main(String title) {
        frame = new Panel(this);

        add(frame);
        setVisible(true);
        setResizable(true);
        setSize(getToolkit().getScreenSize());
        setTitle(title);

        thread = new Thread(this);
        thread.run();
    }

    public void run() {

    }

    public static void main(String[] args) {
        Main engine = new Main("Title");
    }
}
