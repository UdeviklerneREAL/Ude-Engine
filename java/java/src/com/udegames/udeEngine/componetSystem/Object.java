package com.udegames.udeEngine.componetSystem;

import java.awt.image.BufferedImage;

@Deprecated
public class Object {

    private int x = 0, y = 0;
    private BufferedImage image;

    public Object(BufferedImage image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }

    public void transform(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BufferedImage getImage() {
        return image;
    }
}
