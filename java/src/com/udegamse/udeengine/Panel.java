package com.udegamse.udeengine;

import javax.swing.*;

public class Panel extends JPanel {

    public Panel() {
        setVisible(true);
    }

    public void clear() {
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
