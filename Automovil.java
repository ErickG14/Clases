// Clase Automóvil
public class Automovil {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    // Constructor por defecto
    public Automovil() {
        this.marca = "";
        this.modelo = "";
        this.año = 0;
        this.kilometraje = 0;
    }

    // Constructor sobrecargado
    public Automovil(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAnio(int año) {
        this.año = año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Método toString
    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", kilometraje=" + kilometraje +
                '}';
    }

    // Métodos de uso general
    public void encender() {
        System.out.println("El automóvil ha sido encendido.");
    }

    public void apagar() {
        System.out.println("El automóvil ha sido apagado.");
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }
}
