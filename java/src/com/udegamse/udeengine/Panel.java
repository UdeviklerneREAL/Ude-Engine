package com.udegamse.udeengine;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Main engine;

    public Panel(Main enigne) {
        this.engine = enigne;
        setVisible(true);
    }

    public void clear() {
        for(int x = 0; x >= engine.getWidth(); x++) {
            for(int y = 0; y >= engine.getHeight(); y++) {
                getGraphics().clearRect(x, y, 1, 1);
            }
        }
    }
}
