package com.iestrassierra.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.iestrassierra.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setTitle("VideoJuego Pablo Alcudia");
		config.setWindowedMode(897, 600);
		new Lwjgl3Application(new MyGdxGame(), config);
	}
}
