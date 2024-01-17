package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;

public class NaveAmiga extends Nave{

    private ArrayList<DisparoAmigo> rafagaDisparos;

    public NaveAmiga(float posX, float posY, float velY, Texture sprite, Texture explosion/*, ArrayList<rafagaDisparos> lista*/) {
        super(posX, posY, velY, sprite, explosion);
        this.rafagaDisparos = new ArrayList<>();
        //this.rafagaDisparos = lista;
    }

    public void setRafagaDisparos(ArrayList<DisparoAmigo> lista){
        for (int i = 0; i < rafagaDisparos.size(); i++){
            rafagaDisparos.get(i).dispose();
        }

        for (/*CLASEITEM*/DisparoAmigo /*objeto*/unDisparo:/*lista*/rafagaDisparos){
            unDisparo.dispose();
            //objeto.trabajoMetodoFuncionEjecutar(...);
        }
        this.rafagaDisparos = lista;
    }

    //Generalizacion crearDisparos
    /*public void crearObjetoItem(argumentos...) {
        Claseitem objetoItem = new ClaseItem(argumentosItem...);
        contenedor.add(objetoItem);
    }*/

    public void crearDisparo(Texture spriteDisparo){
        DisparoAmigo unDisparo = new DisparoAmigo(posX, posY, 2.0f, spriteDisparo);
        rafagaDisparos.add(unDisparo);
    }
}
