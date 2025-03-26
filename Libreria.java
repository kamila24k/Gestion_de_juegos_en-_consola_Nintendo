import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private String nombre;
    private final List<Cartucho> cartuchos;
    
    public Libreria(String nombre) {
        this.nombre = nombre;
        this.cartuchos = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void agregarCartucho(Cartucho cartucho){
        cartuchos.add(cartucho);
    }
    public void eliminarCartucho(Cartucho cartucho){
        cartuchos.remove(cartucho);
    }
    public List<Cartucho> getCartuchos(){
        return cartuchos;
    }
}
