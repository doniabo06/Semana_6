package arreglos.tienda.modelo;


public class AppStore {
    private static final int MAX = 4;
    private final Juego[] juegos;
    private int indice;

    public AppStore() {
        juegos = new Juego[MAX];
        indice = -1;
    }

    public void incializarDatos (){
        agregarJuego(new Juego("FIFA02026", "Deportes", 10, 70,50));
        agregarJuego(new Juego("Roblox", "Accion",60,75,60 ));
    }

    public Juego[] getJuegos() {
        return juegos;
    }

    public boolean agregarJuego(Juego juego) {
        if (juego != null && indice < MAX - 1) {
            juegos[++indice] = juego;
            return true;
        }
        return false;
    }

    public Juego buscarjuego(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            for (int i = 0; i <= indice; i++) {
                if (nombre.equalsIgnoreCase(juegos[i].getNombre())) {
                    return juegos[i];
                }
            }
        }
        return null;
    }

    public boolean comprar(String nombre, int cantidad) {
        Juego juego = buscarjuego(nombre);
        return juego != null && juego.comprar(cantidad);
    }

    public double vender(String nombre, int cantidad) {
        Juego juego = buscarjuego(nombre);
        if (juego != null && juego.vender(cantidad)) {
            return juego.getPrecio() * cantidad;
        }
        return 0.0;
    }

    public  String juegoMasVendido (){
        String nombre = " ";
        int mayor;
        if (indice >= 0 ){
            nombre = juegos [0].getNombre();
            mayor = juegos [0].getLicenciaDisponibles();
            for (Juego j : juegos){
                if (j != null) {
                    if (j.getLicenciaVendidas() > mayor) {
                        mayor = j.getLicenciaDisponibles();
                        nombre = j.getNombre();
                    }
                } else {
                    return nombre;
                }
            } return nombre;
        }
        return nombre;
    }

}