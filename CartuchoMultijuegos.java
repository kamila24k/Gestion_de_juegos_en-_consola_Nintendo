
import java.util.ArrayList;
import java.util.List;

public class CartuchoMultijuegos extends Cartucho {
    private List<Juego> juegos;
    private int cantidadJuegos;

    public CartuchoMultijuegos(String nombre) {
        super(nombre);
        cantidadJuegos = 0;
        this.juegos = new ArrayList<>();
    }

    public void agregarJuego(Juego juego) {
        if (cantidadJuegos < 3) {
            juegos.add(juego);
            cantidadJuegos++;
        } else {
            System.out.println("No se pueden agregar más juegos");
        }
    }

    public void eliminarjuego(Juego juego) {
        juegos.remove(juego);
        cantidadJuegos--;
    }

    public void mostrarJuegos() {
        for (Juego juego : juegos) {
            System.out.println(juego);
        }
    }
    
}
