package me.justramon.mcsrvgrab.tabs;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Created by JustRamon on 8/11/16.
 */

public class SpongeTab extends JPanel {

	public SpongeTab(){
		super(new MigLayout());

		createView();
	}

	private void createView(){
		JLabel labelInfo = new JLabel("<html><p>Sponge(Forge) Modded Minecraft Server. <br>Has a plugin system like Bukkit and Spigot. The SpongeForge version also has forge mod support. Currently not fully-featured.</p></html>");
		add(labelInfo, "gapleft 5, span, top");
		add(new JButton("Press meh"), "gapleft 5");
	}
}
