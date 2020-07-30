package com.udegamse.udeengine;


import javax.swing.*;

public class UI{
	
	Main engine;
	
	public UI(Main engine) {
		this.engine = engine;
	}

	public static void MessageBox(String title, String message, String icon) {
		if (icon == "Info") {
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
			
		}else if (icon == "Error"){
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		}else if (icon == "Warning") {
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
		}else {
			throw new IllegalArgumentException("The parameter icon cannot be "+ icon + " it has to be 'Info', 'Error' or 'Warning'");
		}
	}
	public static String InputBox(String title, String message) {
	    JFrame frame = new JFrame(title);

	    String result = JOptionPane.showInputDialog(frame, message);
	    
	    return result;
	}
}
