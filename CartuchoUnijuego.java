public class CartuchoUnijuego extends Cartucho {
    private Juego juego;

    public CartuchoUnijuego(String nombre, Juego juego) {
        super(nombre);
        this.juego = juego;
    }

    public void cambiarjuego(Juego juego) {
        this.juego = juego;
    }

    public void mostrarJuego() {
        System.out.println( "Juego: " +juego.getNombre());
    }
    
}
