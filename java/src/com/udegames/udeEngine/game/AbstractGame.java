package com.udegames.udeEngine.game;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Renderer;

public abstract class AbstractGame {

    public abstract void update(Engine engine, float dt);
    public abstract void render(Engine engine, Renderer renderer);
    public abstract void lateRender(Engine engine, Renderer renderer);
<<<<<<< HEAD
=======
    public abstract void Start(Engine engine);
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f

}