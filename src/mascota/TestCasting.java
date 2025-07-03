package mascota;

public class TestCasting {
    public static void main(String[] args) {
        Mascota m = new Gato("Michi");

        // ¿Qué pasa aquí?
        if (m instanceof Perro) {
            Perro p = (Perro) m;  // Esto lanza ClassCastException
            p.ladrar();
        }
        else {
            System.out.println("No es un perro, no se puede ladrar.");
        }
    }
}