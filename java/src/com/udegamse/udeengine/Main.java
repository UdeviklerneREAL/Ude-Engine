package com.udegamse.udeengine;

import javax.swing.*;

public class Main extends JFrame implements Runnable {

    Thread thread;
    Panel panel;

    public Main(String title) {
        panel = new Panel();

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
        while (true) {
            panel.clear();
        }
    }

    public static void main(String[] args) {
        Main engine = new Main("Title");
    }
}
