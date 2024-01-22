package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class DisparoAmigo extends Disparo{
    public DisparoAmigo(float posX, float posY, float velY, float velX, Texture sprite) {
        super(posX, posY, velY, velX, sprite);

        if (velY < 0.0f) {
            this.velY *= -1;
        }
    }
}
