package com.udegames.udeEngine.templates;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Input;
import com.udegames.udeEngine.Renderer;
import com.udegames.udeEngine.componetSystem.PlayerController;
import com.udegames.udeEngine.componetSystem.Sprite;
import com.udegames.udeEngine.game.AbstractGame;

import javax.swing.*;

public class Game extends AbstractGame {

    private Sprite mysprite;
    private Input inputManager;
    private PlayerController playerController;

    @Override
    public void Start(Engine engine) {
        mysprite = new Sprite("res/test3.png");
        playerController = new PlayerController(mysprite, 10);
    }

    @Override
    public void update(Engine engine, float dt) {
    }

    @Override
    public void render(Engine engine, Renderer renderer) {
        playerController.update(engine, renderer);
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
