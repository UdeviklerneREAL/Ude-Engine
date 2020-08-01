package com.udegames.udeEngine.game;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Renderer;

public abstract class AbstractGame {

    public abstract void update(Engine engine, float dt);
    public abstract void render(Engine engine, Renderer renderer);
    public abstract void lateRender(Engine engine, Renderer renderer);

}
