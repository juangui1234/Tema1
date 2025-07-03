package mascota;

public class Main {
    public static void main(String[] args) {
        ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}
/*
Qué pasa si se envía una clase que no hereda de Mascota?

En Java, cuando una función recibe un parámetro de tipo Mascota, solo puede aceptar
objetos que sean de tipo Mascota o de alguna de sus subclases. Si intentamos enviar
un objeto de una clase que no hereda de Mascota, el programa no compilará


Qué pasa si eliminas el instanceof y casteas directamente?

Cuando casteás directamente un objeto sin comprobar su tipo real, estás asumiendo que
sabes exactamente de qué clase es. Si te equivocás, Java lanzará una ClassCastException
en tiempo de ejecución.

*/
