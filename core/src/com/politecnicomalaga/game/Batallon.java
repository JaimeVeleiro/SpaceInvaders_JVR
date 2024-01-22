package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class Batallon {
    protected float posX, posY, velX, velY;

    protected Texture locura;
    ArrayList <Escuadron> misEscuadrones = new ArrayList<Escuadron>();

    public Batallon(float posX, float posY, float velX, float velY, Texture locura) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.locura = locura;
    }

    public void setPosicioEscuadron(){
        for (int i = 0; i < misEscuadrones.size(); i++) {
            Escuadron unEscuadron = new Escuadron(posX, posY, velX, velY, locura);
            misEscuadrones.add(unEscuadron);
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

    public Texture getLocura() {
        return locura;
    }

    public void setLocura(Texture locura) {
        locura = locura;
    }
}
