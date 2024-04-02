package ejr_2;

import java.awt.*;

public abstract class Invitado {
    private String nombre;
    private int fama;

    public Invitado(String nombre, int fama) {
        this.nombre = nombre;
        this.fama = fama;
    }


    public String getNombre() {
        return nombre;
    }

    public int getFama() {
        return fama;
    }
    public int fiesta(){
        return 0;
    }

    @Override
    public String toString() {
        return nombre + "(" + fama + ")";
    }
}
