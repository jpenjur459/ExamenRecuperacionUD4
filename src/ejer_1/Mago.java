package ejer_1;

public class Mago extends Criatura {
    private int NivelMagico;

    public Mago(String nombre, int edad, int nivelMagico) {
        super(nombre, edad);
        NivelMagico = nivelMagico;
        if (edad < 0){
            throw new IllegalArgumentException("la edad no puede ser menor que 0");
        }
        if (nombre.isEmpty() || nombre.isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar en blanco");
        }
    }

    @Override
    public void realizarAccion() {
        if (NivelMagico >= 50){
            System.out.println(getNombre() + " lanza un poderoso hechizo");
        } else if (NivelMagico < 50) {
            System.out.println(getNombre() + " genera una pequeña chispa");
        }
    }
    @Override
    public String toString() {
        return "Mago: " + super.toString();
    }
}
