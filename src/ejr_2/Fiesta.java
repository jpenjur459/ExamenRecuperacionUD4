package ejr_2;

public class Fiesta extends Invitado {
    private int glamur = 0;

    private int aforo = 0;

    public Fiesta(String nombre, int fama, int glamur) {
        super(nombre, fama);
        this.glamur = fiesta();
    }

    public void entrar(String Invitado){
        if (aforo > 100){
            throw new IllegalArgumentException("aforo completo");
        }else {
            glamur = +getFama();
            aforo ++;
        }
    }
    public void salir(String Invitado){

    }

    @Override
    public String toString() {
        return "glamur= " + glamur +"Aforo="+ aforo ;
    }
}
