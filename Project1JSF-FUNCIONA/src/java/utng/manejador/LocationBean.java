package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.LocationDAO;
import utng.modelo.Location;



@ManagedBean
@SessionScoped
public class LocationBean implements Serializable{
    private List<Location> locations;
    private Location location;

    public LocationBean() {
    }

    public List<Location> getLocations(){
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

   

    
    
    public String listar(){
        LocationDAO dao=new LocationDAO();
        try {
            locations = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Locations";   //cambiar por el nombre en plurara de la tabla
    }
    
    public String eliminar(){
        LocationDAO dao = new LocationDAO();
        try {
            dao.delete(location);
            locations=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        location= new Location();
       return "Iniciar";
   }
    
    public String guardar(){
       LocationDAO dao = new LocationDAO();
       try{
           if(location.getIdLocation()!=0){
               dao.update(location);
           }else{
               dao.insert(location);
           }
           locations= dao.getAll();
       }catch (Exception e){
           e.printStackTrace();
       }
       return "Guardar";
   }
    
    public String cancelar(){
       return "Cancelar";
   }
   
   public String editar(Location location){
       this.location= location;
       return "Editar";
   }
    
}
