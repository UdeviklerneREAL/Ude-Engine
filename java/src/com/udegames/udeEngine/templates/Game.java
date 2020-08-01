package com.udegames.udeEngine.templates;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Renderer;
import com.udegames.udeEngine.game.AbstractGame;

import javax.swing.*;

public class Game extends AbstractGame {

    @Override
    public void update(Engine engine, float dt) {

    }

    @Override
    public void render(Engine engine, Renderer renderer) {
        //you will get an error if you run this because you need to edit "YOURIMAGE.png" to an image in your res folder
        /*try {
            renderer.drawImage(ImageIO.read(getClass().getResourceAsStream("/YOURIMAGE.png")), 1, 1, 0, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        renderer.drawString("LOL", 10, 10);
    }

    @Override
    public void lateRender(Engine engine, Renderer renderer) {

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Engine engine = new Engine(new Game());
        engine.start();
    }
}
