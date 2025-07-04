package externo;

import mascota.Mascota;

public class AccesoExterno {
    public static void main(String[] args) {
        Mascota m = new Mascota("Nombre");

        /*
        // System.out.println(m.nombrePrivado);   // Error
        // System.out.println(m.nombreDefault);   // Error
        // System.out.println(m.nombreProtegido); // Error
        */
        System.out.println(m.nombrePublico);      // OK

        m.metodoPublico(); // OK
    }
}
