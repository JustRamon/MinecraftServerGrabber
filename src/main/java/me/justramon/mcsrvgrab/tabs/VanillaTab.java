package me.justramon.mcsrvgrab.tabs;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JustRamon on 8/11/16.
 */

public class VanillaTab extends JPanel {
	public VanillaTab(){
		super(new MigLayout());

		createView();
	}

	private void createView(){
		JLabel labelInfo = new JLabel("<html><p>The Vanilla Minecraft server.<br> Good if you want a stable experience with everything working like it's supposed to.<br> Also, it's the only version with snapshot builds.</p></html>");
		add(labelInfo, "gapleft 5, span, top");
		add(new JButton("Press meh"), "gapleft 5");
	}
}
