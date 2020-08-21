package com.udegames.udeEngine.game;

import com.udegames.udeEngine.Renderer;

public abstract class AbstractScene {

    public static void loadScene(AbstractScene scene, Renderer renderer) {
        scene.rendering(renderer);
    }

    public abstract void rendering(Renderer renderer);

    public abstract void scripts();

}
