<<<<<<< HEAD
// Ude-Engine UISystem is make by RafD
=======
// Ude-Engine UISystem.Made by RafD
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f

package com.udegames.udeEngine.UI;

import javax.swing.*;

public class UISystem {

    public static void MessageBox(String title, String message, String icon) {
        icon = icon.toLowerCase();

        if (icon == "info") {
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
<<<<<<< HEAD

=======
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
        } else if (icon == "error"){
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } else if (icon == "warning") {
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
        } else {
            throw new IllegalArgumentException("The parameter icon cannot be "+ icon + " it has to be 'Info', 'Error' or 'Warning'");
        }
    }

    public static void MessageBox(String title, String message, UIEnum icon) {
        if (icon == UIEnum.INFO) {
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

        } else if (icon == UIEnum.ERROR){
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
        } else if (icon == UIEnum.WARNING) {
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
        } else {
            throw new IllegalArgumentException("The parameter icon cannot be "+ icon + " it has to be 'Info', 'Error' or 'Warning'");
        }
    }

    public static String InputBox(String title, String message) {
        JFrame frame = new JFrame(title);

<<<<<<< HEAD
        String result = JOptionPane.showInputDialog(frame, message);

        return result;
=======
        return JOptionPane.showInputDialog(frame, message);
>>>>>>> e0169aafa44179d75100e5d6c82a74bbf8dbe13f
    }
}