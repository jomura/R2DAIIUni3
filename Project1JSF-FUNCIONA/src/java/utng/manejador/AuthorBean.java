package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AuthorDAO;
import utng.modelo.Author;



@ManagedBean
@SessionScoped
public class AuthorBean implements Serializable{
    private List<Author> authors;
    private Author author;

    public AuthorBean() {
    }

    public List<Author> getAuthors(){
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

   

    
    
    public String listar(){
        AuthorDAO dao=new AuthorDAO();
        try {
            authors = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Authors";   //cambiar por el nombre en plurara de la tabla
    }
    
    public String eliminar(){
        AuthorDAO dao = new AuthorDAO();
        try {
            dao.delete(author);
            authors=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        author= new Author();
       return "Iniciar";
   }
    
    public String guardar(){
       AuthorDAO dao = new AuthorDAO();
       try{
           if(author.getIdAuthor()!=0){
               dao.update(author);
           }else{
               dao.insert(author);
           }
           authors= dao.getAll();
       }catch (Exception e){
           e.printStackTrace();
       }
       return "Guardar";
   }
    
    public String cancelar(){
       return "Cancelar";
   }
   
   public String editar(Author author){
       this.author= author;
       return "Editar";
   }
    
}
