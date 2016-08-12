package me.justramon.mcsrvgrab.tabs;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Created by JustRamon on 8/11/16.
 */

public class SpigotTab extends JPanel {

	public SpigotTab(){
		super(new MigLayout());

		createView();
	}

	private void createView(){
		JLabel labelInfo = new JLabel("<html><p>Spigot (Server-Side) Modded Minecraft Server. <br>Basically the same as Bukkit, but with better performance. <br>Plugins are compatible with Bukkit. <br>Because Spigot applies lots of tweaks, some quirky game mechanics might break.</p></html>");
		add(labelInfo, "gapleft 5, span, top");
		add(new JButton("Press meh"), "gapleft 5");
	}
}
