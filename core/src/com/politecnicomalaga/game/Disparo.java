package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class Disparo extends ObjetoVolador{
    public Disparo(float posX, float posY, float velX, float velY, Texture sprite) {
        super(posX, posY, 0.0f, velY, sprite);
    }

    @Override
    public void setVelX(float velX){

    }
}
