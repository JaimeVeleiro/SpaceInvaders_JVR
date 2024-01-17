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

    public boolean colisiona(ObjetoVolador otroOvni) {
        return this.colisionarFilas(otroOvni) && this.colisionarColumnas(otroOvni);
    }

    public boolean colisionarFilas(ObjetoVolador otroOvni) {
        if (otroOvni.getPosX() >= this.getPosX() && otroOvni.getPosX() <= this.getPosX() + this.getWidth()) return true;

        return otroOvni.getPosX() + otroOvni.getWidth() >= this.getPosX() && otroOvni.getPosX() + otroOvni.getWidth() <= this.getPosX() + this.getWidth();

    }

    public boolean colisionarColumnas(ObjetoVolador otroOvni) {

    }

    public int getWidth() {
        return this.imagen.getWidth();
    }

    public int getHeight() {
        return this.imagen.getHeight();
    }
}
