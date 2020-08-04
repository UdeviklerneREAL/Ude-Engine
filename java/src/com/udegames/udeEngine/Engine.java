package com.udegames.udeEngine;

import com.udegames.udeEngine.game.AbstractGame;

import java.awt.*;

public class Engine implements Runnable {
    private Thread thread;
    private Window window;
    private Renderer renderer;
    private Input input;
    private AbstractGame game;

    private boolean running = false;
    private final double UPDATE_CAP = 1.0/120;
    public int width = Toolkit.getDefaultToolkit().getScreenSize().width, height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public float scale = 1f;
    public String title = "2D Game";

    public Engine(AbstractGame game) {
        this.game = game;
    }

    public void start() {
        window = new Window(this);
        renderer = new Renderer(this);
        input = new Input(this);

        thread = new Thread(this);
        thread.run();
    }

    public void stop() {

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

        game.Start(this);
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

                game.update(this, (float)UPDATE_CAP);

                input.update();

                if(frameTime >= 1.0) {
                    frameTime = 0;
                    fps = frames;
                    frames = 0;
                }
            }

            if(render) {
                renderer.clear();
                game.render(this, renderer);
                game.lateRender(this, renderer);
                window.update();
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

    private void dispose() {

    }

    public Window getWindow() {
        return window;
    }

    public Input getInput() {
        return input;
    }

    /* All the following were made by RafD
    * The following methods make your code more readable */
    public void setTitle(String newTitle){
        getWindow().getFrame().setTitle(newTitle);
    }

    public void setVisible(boolean isVisible){
        getWindow().getFrame().setVisible(isVisible);
    }

    public String getTitle(){ return getWindow().getFrame().getTitle(); }

    public void setIconImage(Image icon){
        getWindow().getFrame().setIconImage(icon);
    }

    public Image getIconImage(){ return getWindow().getFrame().getIconImage(); }
}
