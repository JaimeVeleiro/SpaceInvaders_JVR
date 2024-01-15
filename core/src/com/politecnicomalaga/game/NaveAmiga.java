package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;

public class NaveAmiga extends Nave{

    private ArrayList<DisparoAmigo> rafagaDisparos;

    public NaveAmiga(float posX, float posY, float velY, Texture sprite, Texture explosion) {
        super(posX, posY, velY, sprite, explosion);
        this.rafagaDisparos = new ArrayList<>();
    }
}
