package arreglos.tienda.modelo;

public class Juego {
    private String categoria;
    private String nombre;
    private int tamanio;
    private double precio;
    private int licenciaDisponibles;
    private int licenciaVendidas;


    public Juego(String nombre, String categoria, int tamanio, double precio, int licenciaDisponibles  ) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamanio = tamanio;
        this.precio = precio;
        this.licenciaDisponibles = licenciaDisponibles;
        licenciaVendidas = 0;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getLicenciaDisponibles() {
        return licenciaDisponibles;
    }

    public int getLicenciaVendidas() {
        return licenciaVendidas;
    }


    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty())
            this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty())
            this.nombre = nombre;
    }

    public void setTamanio(int tamanio) {
        if(tamanio > 0 )
            this.tamanio = tamanio;
    }

    public void setPrecio(double precio) {
        if(precio > 0 )
            this.precio = precio;
    }

    public boolean comprar (int cantidad){
        if ( cantidad > 0) {
            licenciaDisponibles += cantidad;
            return true;
        }
        return  false;
    }

    public boolean vender (int cantidad){
        if (cantidad > 0 && cantidad <= licenciaDisponibles){
            licenciaDisponibles -= cantidad;
            licenciaVendidas += cantidad;
            return true;
        }
        return false;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Juego{" +
                "categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                ", licenciaDisponibles=" + licenciaDisponibles +
                ", licenciaVendidas=" + licenciaVendidas +
                '}';
    }


}