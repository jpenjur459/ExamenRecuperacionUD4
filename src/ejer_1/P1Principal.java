package ejer_1;

public class P1Principal {
    public static void main(String[] args) {
        Criatura c1 = new Elfo("rodolfo",20);
        Criatura c2 = new Dragon("manolo",21);
        Criatura c3 = new HombreLobo("lolo",24);
        Criatura c4 = new Mago("miguel",23,51);
        Criatura c5 = new Mago("miguel",2,49);

        System.out.println(c1);
        c1.realizarAccion();
        System.out.println(c2);
        c2.realizarAccion();
        ((Dragon) c2).volar();
        System.out.println(c3);
        c3.realizarAccion();
        System.out.println(c4);
        c4.realizarAccion();
        System.out.println(c5);
        c5.realizarAccion();


    }
}
