package com.udegamse.udeengine;

import java.awt.image.BufferedImage;

public class Renderer {

    Panel panel;

    public Renderer(Panel panel) {
        this.panel = panel;
    }

    public void drawImage(BufferedImage image, int x, int y) {
        panel.getGraphics().drawImage(image, x, y, 100, 100, null);
    }
}
