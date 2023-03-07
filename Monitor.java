public class Monitor {
    private String marca;
    private String modelo;
    private double tamanoPantalla;
    private int resolucion;
    private boolean encendido;

    public Monitor() {}

    public Monitor(String marca, String modelo, double tamanoPantalla, int resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }

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

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void ajustarBrillo(int brillo) {
        System.out.println("Ajustando brillo a " + brillo);
    }

    public void ajustarContraste(int contraste) {
        System.out.println("Ajustando contraste a " + contraste);
    }

    public void mostrarInfo() {
        System.out.println("Monitor: " + marca + " " + modelo + " de " + tamanoPantalla + " pulgadas con resolución " + resolucion + "px");
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanoPantalla=" + tamanoPantalla +
                ", resolucion=" + resolucion +
                ", encendido=" + encendido +
                '}';
    }
}
