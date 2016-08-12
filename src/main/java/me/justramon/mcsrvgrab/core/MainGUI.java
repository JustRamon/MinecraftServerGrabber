package me.justramon.mcsrvgrab.core;


import me.justramon.mcsrvgrab.tabs.BukkitTab;
import me.justramon.mcsrvgrab.tabs.SpigotTab;
import me.justramon.mcsrvgrab.tabs.SpongeTab;
import me.justramon.mcsrvgrab.tabs.VanillaTab;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JustRamon on 8/11/16.
 */

public class MainGUI extends JFrame {

	public MainGUI(){
		createView();

		setTitle("Minecraft Server Grabber");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(600, 400));
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void createView(){
		// Creating panel with CardLayout.
		JPanel panel = new JPanel(new CardLayout());
		getContentPane().add(panel);

		// Creating tabs, with their respective panels.
		JTabbedPane tabs = new JTabbedPane();

		// Vanilla Tab
		tabs.addTab("Vanilla", new VanillaTab());

		// Bukkit Tab
		tabs.addTab("Bukkit", new BukkitTab());

		// Spigot Tab
		tabs.addTab("Spigot", new SpigotTab());

		// Sponge Tab
		tabs.addTab("Sponge", new SpongeTab());

		panel.add(tabs);
	}
}
