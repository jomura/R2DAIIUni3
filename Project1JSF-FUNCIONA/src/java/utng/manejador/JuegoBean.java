package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.JuegoDAO;
import utng.modelo.Juego;



@ManagedBean
@SessionScoped
public class JuegoBean implements Serializable{
    private List<Juego> juegos;
    private Juego juego;

    public JuegoBean() {
    }

    public List<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

   

    
    
    public String listar(){
        JuegoDAO dao=new JuegoDAO();
        try {
            juegos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Juegos";   //cambiar por el nombre en plurara de la tabla
    }
    
    public String eliminar(){
        JuegoDAO dao = new JuegoDAO();
        try {
            dao.delete(juego);
            juegos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        juego= new Juego();
       return "Iniciar";
   }
    
    public String guardar(){
       JuegoDAO dao = new JuegoDAO();
       try{
           if(juego.getIdJuego()!=0){
               dao.update(juego);
           }else{
               dao.insert(juego);
           }
           juegos= dao.getAll();
       }catch (Exception e){
           e.printStackTrace();
       }
       return "Guardar";
   }
    
    public String cancelar(){
       return "Cancelar";
   }
   
   public String editar(Juego juego){
       this.juego= juego;
       return "Editar";
   }
    
}
