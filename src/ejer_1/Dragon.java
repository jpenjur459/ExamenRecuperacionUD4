package ejer_1;


public class Dragon extends Criatura implements Volar {
    public Dragon(String nombre, int edad) {
        super(nombre, edad);
        if (edad < 0){
            throw new IllegalArgumentException("la edad no puede ser menor que 0");
        }
        if (nombre.isEmpty() || nombre.isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar en blanco");
        }
    }

    @Override
    public void realizarAccion() {
        System.out.println(getNombre() + " escupe fuego");
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " vuela ágilmente sobre los arboles");
    }

    @Override
    public String toString() {
        return "Dragon: " + super.toString();
    }
}
