// Clase Persona
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.direccion = "";
    }

    // Constructor sobrecargado
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    // Métodos de uso general
    public void saludar() {
        System.out.println("Hola, soy " + this.nombre);
    }

   
