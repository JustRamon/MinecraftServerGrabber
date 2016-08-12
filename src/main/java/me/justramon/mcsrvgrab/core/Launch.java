package me.justramon.mcsrvgrab.core;


import javax.swing.*;

/**
 * Created by JustRamon on 8/11/16.
 */
public class Launch {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			public void run() {
				new MainGUI().setVisible(true);
			}
		});
	}
}
