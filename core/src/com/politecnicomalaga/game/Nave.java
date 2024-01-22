package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Nave extends ObjetoVolador{
    protected Texture explosion, imagen;
    protected boolean vivo;

    public Nave(float posX, float posY, float velY, float velX, Texture sprite, Texture explosion){
        super(posX, posY, velY, velX, sprite);
        this.explosion = explosion;
        this.vivo = true;
    }

    public Texture getExplosion() {
        return explosion;
    }

    public void setExplosion(Texture explosion) {
        this.explosion = explosion;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void explotar(){
        this.vivo = false;
        if (imagen != null) imagen.dispose();
        this.imagen = explosion;
    }


}
