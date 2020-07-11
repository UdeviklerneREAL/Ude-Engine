package com.udegamse.udeengine;

import java.awt.event.*;

public class Input implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {

    Main engine;

    private final int NUM_KEYS = 256;
    private boolean[] keys = new boolean[NUM_KEYS];
    private boolean[] keysLast = new boolean[NUM_KEYS];

    private final int NUM_BUTTONS = 5;
    private boolean[] buttons = new boolean[NUM_BUTTONS];
    private boolean[] buttonsLast = new boolean[NUM_BUTTONS];

    public int mouseX, mouseY;
    public int scroll;

    public Input(Main engine) {
        this.engine = engine;
        mouseX = 0;
        mouseY = 0;
        scroll = 0;

        engine.panel.addKeyListener(this);
        engine.panel.addMouseListener(this);
        engine.panel.addMouseMotionListener(this);
        engine.panel.addMouseWheelListener(this);
    }

    public void update() {
        scroll = 0;

        for(int i = 0; i < NUM_KEYS; i++) {
            keysLast[i] = keys[i];
        }

        for(int i = 0; i < NUM_BUTTONS; i++) {
            buttonsLast[i] = buttons[i];
        }
    }
    public boolean isKey(int keyCode) {
        return keys[keyCode];
    }

    public boolean isKeyUp(int keyCode) {
        return !keys[keyCode] && keysLast[keyCode];
    }

    public boolean isKeyDown(int keyCode) {
        return keys[keyCode] && !keysLast[keyCode];
    }

    public boolean isButton(int buttonCode) {
        return buttons[buttonCode];
    }

    public boolean isButtonUp(int buttonCode) {
        return !buttons[buttonCode] && buttonsLast[buttonCode];
    }

    public boolean isButtonDown(int buttonCode) {
        return buttons[buttonCode] && !buttonsLast[buttonCode];
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        buttons[e.getButton()] = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        buttons[e.getButton()] = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = (int)(e.getX());
        mouseY = (int)(e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = (int)(e.getX());
        mouseY = (int)(e.getY());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        scroll = e.getWheelRotation();
    }
}
