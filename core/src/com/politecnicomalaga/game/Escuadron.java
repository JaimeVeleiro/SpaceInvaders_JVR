package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class Escuadron {
    protected float posX, posY, velX, velY;
    protected Texture imagen, sprite, explosion;

    ArrayList<NaveEnemiga> misNaves = new ArrayList<NaveEnemiga>();

    public Escuadron(float posX, float posY, float velX, float velY, Texture imagen) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.imagen = imagen;
    }

    public void setPosicioNaves(){
        for (int i = 0; i < misNaves.size(); i++) {
            NaveEnemiga unaNave = new NaveEnemiga(posX, posY, velY, velX, sprite, explosion);
            misNaves.add(unaNave);
        }
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
