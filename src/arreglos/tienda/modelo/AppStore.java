package arreglos.tienda.modelo;


public class AppStore {
    private static final int MAX = 4;
    private final Juego[] juegos;
    private int indice;

    public AppStore() {
        juegos = new Juego[MAX];
        indice = -1;
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


}