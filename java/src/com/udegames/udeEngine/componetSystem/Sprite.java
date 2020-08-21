// Developed by RafD

package com.udegames.udeEngine.componetSystem;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.imageio.ImageIO;;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
/*
* The Sprite class allows for the rendering of a sprite and is the descendant of the Object class.
* The following code will create a sprite and place it at your cursors position
* Example Code:
*
*   private Sprite mysprite;
*   private Input inputManager;
*
*   @Override
*   public void Start(Engine engine) {
*      mysprite = new Sprite("res/test.png");
*      inputManager = new Input(engine);
*
*   @Override
*    public void render(Engine engine, Renderer renderer) {
*        renderer.drawSprite(mysprite, inputManager.mouseX, inputManager.mouseY);
*    }
*/
public class Sprite {
    private int width, height, x = 0, y = 0;
    private int[] pixels;
    private int[] dimensions = new int[2];
    private BufferedImage image = null;

    public boolean visible = true; // If false the sprite is not displayed even if the drawSprite method is called

    public Sprite(String imagePath){
        try{
            image = ImageIO.read(new FileInputStream(imagePath)); // Get the image
        } catch (IOException e){
            e.printStackTrace(); // Print debug info
        }
        // Initialize some variables
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.pixels = image.getRGB(0, 0, width, height, null,0,  width);
        this.dimensions[0] = width;
        this.dimensions[1] = height;

        // Just for good measure
        image.flush();
    }

    // Getters and Setters

    // Setters
    @Setter
    public void setWidth(int width) {
        this.width = width;
    }

    @Setter
    public void setHeight(int height) {
        this.height = height;
    }

    @Setter
    public void setPixels(int[] pixels) {
        this.pixels = pixels;
    }

    @Setter
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Setter
    public void setDimensions(int width, int height){
        this.width = width;
        this.height = height;
        dimensions[0] = this.width;
        dimensions[1] = this.height;
    }

    @Setter
    public void setX(int x){
        this.x = x;
    }

    @Setter
    public void setY(int y){
        this.y = y;
    }

    // Getters
    @Getter
    public int getWidth() {
        return width;
    }

    @Getter
    public int getHeight() {
        return height;
    }

    @Getter
    public int[] getPixels() {
        return pixels;
    }

    @Getter
    public boolean isVisible() {
        return visible;
    }

    @Getter
    public int[] getDimensions(){
        return this.dimensions;
    }

    @Getter
    public BufferedImage getImage(){
        return image;
    }

    @Getter
    public int getX(){
        return this.x;
    }

    @Getter
    public int getY(){
        return this.y;
    }

    @Getter
    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }

    @Getter
    public boolean isColliding(Rectangle otherObjectsBounds){
        return getBounds().intersects(otherObjectsBounds);
    }
}