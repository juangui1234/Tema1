package mascota;

public class Mascota {
    protected String nombre;
    protected String nombreProtegido = "Protegido";
    public String nombrePublico = "Publico";
    private String NombrePrivado = "privado";
    String nombreDefault = "Default";

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    void metodoDefault() {
        System.out.println("Método default");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    public void metodoPublico() {
        System.out.println("Método público");
    }
}