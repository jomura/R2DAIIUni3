package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.DocenteDAO;
import utng.modelo.Docente;



@ManagedBean
@SessionScoped
public class DocenteBean implements Serializable{
    private List<Docente> docentes;
    private Docente docente;

    public DocenteBean() {
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    public String listar(){
        DocenteDAO dao=new DocenteDAO();
        try {
            docentes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Docentes";
    }
    
    public String eliminar(){
        DocenteDAO dao = new DocenteDAO();
        try {
            dao.delete(docente);
            docentes=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
       docente= new Docente();
       return "Iniciar";
   }
    
    public String guardar(){
       DocenteDAO dao = new DocenteDAO();
       try{
           if(docente.getIdDocente()!=0){
               dao.update(docente);
           }else{
               dao.insert(docente);
           }
           docentes= dao.getAll();
       }catch (Exception e){
           e.printStackTrace();
       }
       return "Guardar";
   }
    
    public String cancelar(){
       return "Cancelar";
   }
   
   public String editar(Docente docente){
       this.docente= docente;
       return "Editar";
   }
    
}
