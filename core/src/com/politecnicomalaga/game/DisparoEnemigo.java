package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class DisparoEnemigo extends Disparo{
    public DisparoEnemigo(float posX, float posY, float velY, Texture sprite) {
        super(posX, posY, velY, sprite);

        if (velY > 0.0f) {
            this.velY *= -1;
        }
    }
}
