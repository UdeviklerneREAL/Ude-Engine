// This part was developed by RafD

/*
* The purpose of the PlayerController class is to provide an out of the box player movement in order to speed up development.
* You can create a more sophisticated player movement class that fits your needs down the line but this class should get
* you started.
* Example:
* private Sprite mysprite;
*  private PlayerController playerController;
*
*  @Override
*  public void Start(Engine engine) {
*      mysprite = new Sprite("res/test.png"); // Make sure that this file exists
*      playerController = new PlayerController(mysprite, 10);
*  }
*
*  @Override
*  public void render(Engine engine, Renderer renderer) {
*      playerController.update(engine, renderer);
*  }
*/

package com.udegames.udeEngine.componetSystem;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Renderer;
import jdk.nashorn.internal.objects.annotations.Constructor;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.awt.event.KeyEvent;

public class PlayerController {

    private Thread thread;
    private Sprite sprite;
    private int vSpeed;
    private int hSpeed;

    public PlayerController(Sprite sprite, int speed){
        this.hSpeed = speed;
        this.vSpeed = speed;
        this.sprite = sprite;
    }

    public PlayerController(Sprite sprite, int hSpeed, int vSpeed){
        this.vSpeed = vSpeed;
        this.hSpeed = hSpeed;
        this.sprite = sprite;
    }

    public void update(Engine engine, Renderer renderer){
        renderer.drawSprite(sprite, sprite.getX(), sprite.getY());
        if (engine.getInput().isKey(KeyEvent.VK_A) || engine.getInput().isKey(KeyEvent.VK_LEFT)){
            renderer.drawSprite(sprite, sprite.getX()-hSpeed, sprite.getY());
        } else if (engine.getInput().isKey(KeyEvent.VK_D) || engine.getInput().isKey(KeyEvent.VK_RIGHT)){
            renderer.drawSprite(sprite, sprite.getX()+hSpeed, sprite.getY());
        }
        if (engine.getInput().isKey(KeyEvent.VK_W) || engine.getInput().isKey(KeyEvent.VK_UP)){
            renderer.drawSprite(sprite, sprite.getX(), sprite.getY()-vSpeed);
        } else if (engine.getInput().isKey(KeyEvent.VK_S) || engine.getInput().isKey(KeyEvent.VK_DOWN)){
            renderer.drawSprite(sprite, sprite.getX(), sprite.getY()+vSpeed);
        }
    }

    // Getters and Setters

    // Setters
    @Setter
    public void setVSpeed(int vSpeed){
        this.vSpeed = vSpeed;
    }

    @Setter
    public void setHSpeed(int hSpeed){
        this.hSpeed = hSpeed;
    }

    @Setter
    public void setSpeed(int speed){
        this.hSpeed = speed;
        this.vSpeed = speed;
    }

    // Getters
    @Getter
    public int getVSpeed(){
        return this.vSpeed;
    }

    @Getter
    public int getHSpeed(){
        return this.hSpeed;
    }

    @Getter
    public int getSpeed(){
        if (vSpeed == hSpeed){
            return vSpeed;
        } else{
            throw new RuntimeException("The speed value for the vertical and the horizontal speed are different." +
                    "Please use the getHSpeed or teh getVSpeed methods" +
                    "to get the speed value");
        }
    }

}
