package com.udegamse.udeengine;

import java.awt.image.BufferedImage;

public class Renderer {

    Main engine;
    Panel panel;

    public Renderer(Main engine) {
        this.engine = engine;
        panel = this.engine.panel;
    }

    public void drawImage(BufferedImage image, int scaleX, int scaleY, int x, int y) {
        panel.getGraphics().drawImage(image, x, y, scaleX * image.getWidth(), scaleY * image.getHeight(), null);
    }
}
