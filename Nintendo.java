
import java.util.ArrayList;
import java.util.List;

public class Nintendo {
    private final List<Libreria> librerias;

    public Nintendo(){
        librerias = new ArrayList<>();
    }

    public void agregarLibreria(Libreria libreria){
        librerias.add(libreria);
    }
    public void eliminarLibreria(Libreria libreria){
        librerias.remove(libreria);
    }
    public List<Libreria> getLibrerias(){
        return librerias;
    }
    public void mostrarLibrerias(){
        System.out.println("Librerias en tu Nintendo"); //Para el bucle for se usa  for(TipoDeDato variable : lista){} donde TipoDeDato es el tipo de dato de la lista (en este caso clase de objetos), variable es la variable que se usará para representar cada objeto de la lista y lista es la lista que se recorrerá
        for(Libreria libreria : librerias){ //Libreria es el objeto, librerias es la lista que contiene Libreria(s) y libreria es la variable que que representa el objeto en las iteraciones del loop
            System.out.println("\n" + libreria.getNombre());
            for(Cartucho cartucho : libreria.getCartuchos()){
                System.out.println("\n" + cartucho.getNombre());
                if (cartucho instanceof CartuchoUnijuego) { //El operador instanceof se usa para verificar si un objeto es una instancia de una clase en particular
                    CartuchoUnijuego cartuchoUnijuego = (CartuchoUnijuego) cartucho; //Se hace un cast del objeto Cartucho a CartuchoUnijuego
                    cartuchoUnijuego.mostrarJuego();
                } else if (cartucho instanceof CartuchoMultijuegos) {
                    CartuchoMultijuegos cartuchoMultijuegos = (CartuchoMultijuegos) cartucho;
                    System.out.println("Juegos: ");
                    cartuchoMultijuegos.mostrarJuegos();
                    }
                }
            }
        }
    }
