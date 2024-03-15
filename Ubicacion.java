import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
    private int id;
    private String descripcion;
    private Map<String, Integer> exist;

    public Ubicacion(int id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
        exist= new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExist() {
        return exist;
    }

    public void addExit(String direccion, int idUbicacion){
        exist.put(direccion,idUbicacion);
    }
}
