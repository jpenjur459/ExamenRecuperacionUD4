package ejer_1;

public abstract class Criatura {
    private String nombre;
    private int edad;
    private int NivelDeEnergia;

    public Criatura(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivelDeEnergia() {
        return NivelDeEnergia;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty() || nombre.isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar en blanco");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0){
            throw new IllegalArgumentException("edad no puede ser menor que 0");
        }
        this.edad = edad;
    }

    public abstract void realizarAccion();

    @Override
    public String toString() {
        return "nombre " + nombre+ " edad " + edad;
    }
}