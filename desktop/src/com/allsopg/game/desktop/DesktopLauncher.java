package com.allsopg.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.allsopg.game.MyGdxGame;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		TexturePacker.process("../assets/gfx", "../assets/gfx", "ammo_assets");
		new LwjglApplication(new MyGdxGame(), config);
	}
}
