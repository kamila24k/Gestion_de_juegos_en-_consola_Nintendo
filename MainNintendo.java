public class MainNintendo {
    public static void main(String[] args) {
        Juego juego1 = new Juego("Super Mario Bros","Aventura");
        Juego juego2 = new Juego("The Legend of Zelda","Aventura");
        Juego juego3 = new Juego("Tetris", "Puzzle");
        CartuchoUnijuego cartucho1 = new CartuchoUnijuego("Cartucho 1,unijuego", juego1);
        CartuchoMultijuegos cartucho2 = new CartuchoMultijuegos("Cartucho 2,multijuegos");
        cartucho2.agregarJuego(juego2);
        cartucho2.agregarJuego(juego3);
        Libreria libreria1 = new Libreria("Libreria 1");
        libreria1.agregarCartucho(cartucho1);
        libreria1.agregarCartucho(cartucho2);
        Nintendo nintendo = new Nintendo();
        nintendo.agregarLibreria(libreria1);
        nintendo.mostrarLibrerias();
        juego1.setNombre("Super Mario Bros 3");
        System.out.println("---------------------- \nACTUALIZACIÓN\n");
        nintendo.mostrarLibrerias();
    }
}
