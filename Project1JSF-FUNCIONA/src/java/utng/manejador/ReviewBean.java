package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ReviewDAO;
import utng.modelo.Review;



@ManagedBean
@SessionScoped
public class ReviewBean implements Serializable{
    private List<Review> reviews;
    private Review review;

    public ReviewBean() {
    }

    public List<Review> getReviews(){
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

   

    
    
    public String listar(){
        ReviewDAO dao=new ReviewDAO();
        try {
            reviews = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "reviews";   //cambiar por el nombre en plurara de la tabla
    }
    
    public String eliminar(){
        ReviewDAO dao = new ReviewDAO();
        try {
            dao.delete(review);
            reviews=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        review= new Review();
       return "Iniciar";
   }
    
    public String guardar(){
       ReviewDAO dao = new ReviewDAO();
       try{
           if(review.getIdReview()!=0){
               dao.update(review);
           }else{
               dao.insert(review);
           }
           reviews= dao.getAll();
       }catch (Exception e){
           e.printStackTrace();
       }
       return "Guardar";
   }
    
    public String cancelar(){
       return "Cancelar";
   }
   
   public String editar(Review review){
       this.review= review;
       return "Editar";
   }
    
}
