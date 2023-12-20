package com.politecnicomalaga.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float r, g, b;
	int x, y, despl;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("durizimo.jpg");
	}

	@Override
	public void render () {
		despl++;
		r = (float) Math.random();
		b = (float) Math.random();
		r = (float) Math.random();
		ScreenUtils.clear(r, g, b, 1);
		batch.begin();
		batch.draw();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
