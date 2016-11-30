
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.JuegoDAO;
import utng.datos.GanadorDAO;
import utng.modelo.Juego;
import utng.modelo.Ganador;

@ManagedBean(name = "ganadorBean")
@SessionScoped
public class GanadorBean implements Serializable{
    private List<Ganador> ganadores;
    private Ganador ganador;
    private List<Juego> juegos;
    public GanadorBean(){
        ganador=new Ganador();
        ganador.setJuego(new Juego());
    }

    public List<Ganador> getGanadores() {
        return ganadores;
    }

    public void setGanadores(List<Ganador> ganadores) {
        this.ganadores = ganadores;
    }

    public Ganador getGanador() {
        return ganador;
    }

    public void setGanador(Ganador ganador) {
        this.ganador = ganador;
    }

    public List<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    
    
    
    public String listar(){
        GanadorDAO dao = new GanadorDAO();
        try {
            ganadores = dao.getAll();
        } catch (Exception e) { 
            e.printStackTrace();
        }
        return "Ganadores";   //cambiar por el nombre en plural de la tabla
    }
    
    public String eliminar(){
        GanadorDAO dao = new GanadorDAO();
        try {
            dao.delete(ganador);
            ganadores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String guardar(){
        GanadorDAO dao = new GanadorDAO();
        try {
            if(ganador.getIdGanador()!=0){
                dao.update(ganador);
            }else{
                dao.insert(ganador);
            } 
            ganadores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public  String cancelar(){
        return "Cancelar";
    }
    
    public String editar(Ganador ganador){
        this.ganador= ganador;
        try {
           ganadores = new GanadorDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
    
    public String iniciar(){
       ganador= new Ganador();
       ganador.setJuego(new Juego());
       
        try {
            juegos= new JuegoDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return "Iniciar";
   }

}
