package com.udegames.udeEngine;

import com.udegames.udeEngine.componetSystem.Object;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Renderer {

    private Engine engine;
    private int[] p;

    public Renderer(Engine engine) {
        this.engine = engine;
        p = ((DataBufferInt)engine.getWindow().getImage().getRaster().getDataBuffer()).getData();
    }

    public void clear() {
        for(int i = 0; i < p.length; i++) {
            p[i] = 0;
        }
    }

    public void drawImage(BufferedImage image, int scaleX, int scaleY, int x, int y) {
        int height = image.getHeight(), width = image.getWidth();
        engine.getWindow().getImage().getGraphics().drawImage(image, x, y, scaleX * width, scaleY * height, null);
    }

    public void drawObject(Object object, int scaleX, int scaleY) {
        drawImage(object.getImage(), scaleX, scaleY, object.getX(), object.getY());
    }

    public void drawObject(Object object, int scaleX, int scaleY, int x, int y) {
        drawImage(object.getImage(), scaleX, scaleY, x, y);
    }

    public void drawString(String text, int x, int y) {
        engine.getWindow().getImage().getGraphics().drawString(text, x, y);
    }

    // This part by RafD
    public void drawLine(int x1, int y1, int x2, int y2) {
        engine.getWindow().getImage().getGraphics().drawLine(x1, y1, x2, y2);
    }
}