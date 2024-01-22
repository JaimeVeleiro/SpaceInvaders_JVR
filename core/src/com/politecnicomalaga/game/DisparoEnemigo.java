package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class DisparoEnemigo extends Disparo{
    public DisparoEnemigo(float posX, float posY, float velY, float velX, Texture sprite) {
        super(posX, posY, velY, velX, sprite);

        if (velY > 0.0f) {
            this.velY *= -1;
        }
    }
}
