package com.udegames.udeEngine.templates;

import com.udegames.udeEngine.Engine;
import com.udegames.udeEngine.Renderer;
<<<<<<< HEAD
import com.udegames.udeEngine.UI.UIEnum;
=======
import com.udegames.udeEngine.MusicPlayer.MusicPlayer;
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
import com.udegames.udeEngine.UI.UISystem;
import com.udegames.udeEngine.game.AbstractGame;

import javax.swing.*;
<<<<<<< HEAD
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
=======
import java.awt.image.BufferedImage;
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f

public class Game extends AbstractGame {

    @Override
<<<<<<< HEAD
=======
    public void Start(Engine engine) {
    }

    @Override
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
    public void update(Engine engine, float dt) {

    }

    @Override
    public void render(Engine engine, Renderer renderer) {
<<<<<<< HEAD
        //you will get an error if you run this because you need to edit "YOURIMAGE.png" to an image in your res folder
        /*try {
            renderer.drawImage(ImageIO.read(getClass().getResourceAsStream("/YOURIMAGE.png")), 1, 1, 0, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        renderer.drawString("LOL", 10, 10);
=======

>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
    }

    @Override
    public void lateRender(Engine engine, Renderer renderer) {
<<<<<<< HEAD

=======
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
<<<<<<< HEAD
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
=======
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
            e.printStackTrace();
        }
        Engine engine = new Engine(new Game());
        engine.start();
    }
}
