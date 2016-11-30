
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.DocenteDAO;
import utng.datos.GrupoDAO;
import utng.modelo.Docente;
import utng.modelo.Grupo;

@ManagedBean(name = "grupoBean")
@SessionScoped
public class GrupoBean implements Serializable{
    private List<Grupo> grupos;
    private Grupo grupo;
    private List<Docente> docentes;
    public GrupoBean(){
        grupo=new Grupo();
        grupo.setDocente(new Docente());
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }
    
    public String listar(){
        GrupoDAO dao = new GrupoDAO();
        try {
            grupos = dao.getAll();
        } catch (Exception e) { 
            e.printStackTrace();
        }
        return "Grupos";
    }
    
    public String eliminar(){
        GrupoDAO dao = new GrupoDAO();
        try {
            dao.delete(grupo);
            grupos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String guardar(){
        GrupoDAO dao = new GrupoDAO();
        try {
            if(grupo.getIdGrupo()!=0){
                dao.update(grupo);
            }else{
                dao.insert(grupo);
            } 
            grupos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public  String cancelar(){
        return "Cancelar";
    }
    
    public String editar(Grupo grupo){
        this.grupo= grupo;
        try {
            grupos = new GrupoDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
    
    public String iniciar(){
       grupo= new Grupo();
       grupo.setDocente(new Docente());
        try {
            docentes= new DocenteDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return "Iniciar";
   }

}
