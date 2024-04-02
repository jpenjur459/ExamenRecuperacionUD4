package ejer_1;

public class HombreLobo extends Criatura {
    public HombreLobo(String nombre, int edad) {
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
        System.out.println(getNombre() + " aúlla a la luna");
    }
    @Override
    public String toString() {
        return "HombreLobo: " + super.toString();
    }

}
