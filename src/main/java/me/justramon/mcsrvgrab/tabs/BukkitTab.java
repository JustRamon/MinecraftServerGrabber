package me.justramon.mcsrvgrab.tabs;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JustRamon on 8/11/16.
 */

public class BukkitTab extends JPanel{

	public BukkitTab()
	{
		super(new MigLayout());

		createView();
	}

	private void createView(){
		JLabel labelInfo = new JLabel("<html><p>Bukkit (Server-side) Modded Minecraft Server.<br> Allows you to add plugin-mods to your server. Plugins are compatible with Spigot. <br>If you want this + better performance, try Spigot.</p></html>");
		add(labelInfo, "gapleft 5, span, top");
		add(new JButton("Press meh"), "gapleft 5");
	}
}
