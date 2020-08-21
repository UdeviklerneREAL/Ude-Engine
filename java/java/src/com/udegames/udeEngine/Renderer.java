package com.udegames.udeEngine;

import com.udegames.udeEngine.componetSystem.Sprite;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import com.udegames.udeEngine.componetSystem.Object;

public class Renderer {

    private Engine engine;
    private int[] p;
    private boolean isDrawn[][] = new boolean[5000][5000];
    private int pW, pH;

    public Renderer(Engine engine) {
        this.engine = engine;
        pW = engine.width;
        pH = engine.height;
        p = ((DataBufferInt)engine.getWindow().getImage().getRaster().getDataBuffer()).getData();
    }

    public void clear() {
        for(int i = 0; i < p.length; i++) {
            p[i] = 0;
        }
    }

    public void drawImage(BufferedImage image, int scaleX, int scaleY, int x, int y) {
        int height = image.getHeight(), width = image.getWidth();
        engine.getWindow().getImage().getGraphics().drawImage((Image) image, x, y, scaleX * width, scaleY * height, null);
        isDrawn[x][y] = true;
    }

    @Deprecated
    public void drawObject(Object object, int scaleX, int scaleY) {
        drawImage(object.getImage(), scaleX, scaleY, object.getX(), object.getY());
    }

    @Deprecated
    public void drawObject(Object object, int scaleX, int scaleY, int x, int y) {
        drawImage(object.getImage(), scaleX, scaleY, x, y);
    }

    //This part by RafD
    public void drawImage(BufferedImage image, int x, int y){
        int scaleX = 50, scaleY = 50;
        drawImage(image, scaleX, scaleY, x, y);
        isDrawn[x][y] = true;
    }

    //This part by RafD
    public void setPixel(int x, int y, int value){
        if (x < 0 || x >= pW || y < 0 || y >= pH){
            return;
        }
        p[x + y * pW] = value;

    }

    //This part by RafD
    public void drawSprite(Sprite sprite, int offX, int offY){
        sprite.setX(offX);
        sprite.setY(offY);
        sprite.setDimensions(offX, offY);
        if (!sprite.visible){
            return;
        }
        for (int y = 0; y < sprite.getHeight(); y++ ){
            for (int x = 0; x < sprite.getWidth(); x++){
                setPixel(x + offX, y + offY, sprite.getPixels()[x + y * sprite.getWidth()]);
            }
        }
    }

    //This part by RafD
    public void drawSprite(Sprite sprite){
        drawSprite(sprite, 0, 0);
    }

    public void drawString(String text, int x, int y) {
        engine.getWindow().getImage().getGraphics().drawString(text, x, y);
        isDrawn[x][y] = true;
    }

    // This part by RafD
    public void drawLine(int x1, int y1, int x2, int y2) {
        engine.getWindow().getImage().getGraphics().drawLine(x1, y1, x2, y2);
    }

    // This part by RafD
    // The method is not very stable because it not aware of the location of a sprite, line and some other methods.
    // And even for the methods it does record it is not very reliable
    @Deprecated
    public boolean isAvailable(int x, int y) throws ArrayIndexOutOfBoundsException{
        return isDrawn[x][y];
    }
}