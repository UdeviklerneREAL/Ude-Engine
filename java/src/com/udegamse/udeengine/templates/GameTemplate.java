package com.udegamse.udeengine.templates;

import com.udegamse.udeengine.Main;
import com.udegamse.udeengine.Renderer;

public abstract class GameTemplate {

    public abstract void update(Main engine, float dt);

    public abstract void renderer(Main engine, Renderer renderer);

}
