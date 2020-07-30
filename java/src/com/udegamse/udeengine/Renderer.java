package com.udegamse.udeengine;

import java.awt.*;

import java.awt.image.BufferedImage;

import javax.swing.*;

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

    public void drawString(String str, int x, int y) {
        panel.getGraphics().drawString(str, x, y);
    }
    
    public void drawLine(int x1, int y1, int x2, int y2) {
    	panel.getGraphics().drawLine(x1, y1, x2, y2);
    }
}
