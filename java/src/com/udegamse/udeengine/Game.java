package com.udegamse.udeengine;

import com.udegamse.udeengine.templates.GameTemplate;

public class Game extends GameTemplate {

    @Override
    public void update(Main engine, float dt) {

    }

    @Override
    public void renderer(Main engine, Renderer renderer) {
        renderer.drawString("LOL", 10, 10);
    }

    public static void main(String[] args) {
        Main engine = new Main("Game", new Game());
    }
}
