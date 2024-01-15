package com.politecnicomalaga.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, img2;
	float r, g, b, x, y, screenW, screenH;
	int  despl, iPasos;
	String imgStr;



	@Override
	public void create () {
		batch = new SpriteBatch();


		img = new Texture(imgStr);


		screenW = Gdx.graphics.getWidth();
		screenH = Gdx.graphics.getHeight();


	}

	@Override
	public void render () {
		despl++;
		r = (float) Math.random();
		b = (float) Math.random();
		r = (float) Math.random();

		ScreenUtils.clear(1, 0, 0, 1);

		batch.begin();
		batch.draw(img, 0, 0);
		//miEscena.render(batch);
		batch.end();



	}



	@Override
	public void dispose () {
		batch.dispose();


		img.dispose();



	}
}
