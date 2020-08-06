package com.udegames.udeEngine.templates;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Renderer;
import com.udegames.udeEngine.MusicPlayer.MusicPlayer;
import com.udegames.udeEngine.UI.UISystem;
import com.udegames.udeEngine.game.AbstractGame;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Game extends AbstractGame {

    @Override
    public void Start(Engine engine) {
    }

    @Override
    public void update(Engine engine, float dt) {

    }

    @Override
    public void render(Engine engine, Renderer renderer) {

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
