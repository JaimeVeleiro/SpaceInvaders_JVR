package com.politecnicomalaga.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture locura;

	float r, g, b, x, y;
	int  despl, iPasos;

	Batallon miBatallon = new Batallon(0, 0, 0, 0, locura);



	@Override
	public void create () {
		batch = new SpriteBatch();
		locura = new Texture(Gdx.files.internal("naveEnemiga.png"));

	}



	@Override
	public void render () {
		despl++;
		r = (float) Math.random();
		b = (float) Math.random();
		r = (float) Math.random();

		batch.begin();
		batch.draw(miBatallon.getLocura(), 0, 0);
		batch.end();
	}



	@Override
	public void dispose () {
		batch.dispose();
		locura.dispose();
	}
}
