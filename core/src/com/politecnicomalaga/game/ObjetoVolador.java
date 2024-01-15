package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class ObjetoVolador {
    protected float posX, posY, velX, velY;
    protected Texture sprite;

    public ObjetoVolador(float posX, float posY, float velX, float velY, Texture sprite) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.sprite = sprite;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public Texture getImagen() {
        return imagen;
    }

    public void setImagen(Texture imagen) {
        this.imagen = imagen;
    }
}
