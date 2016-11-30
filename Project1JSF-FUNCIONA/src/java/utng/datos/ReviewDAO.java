package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Review;

public class ReviewDAO extends DAO<Review>{

    public ReviewDAO() {
        super(new Review());
    }

    protected Review getOneById(Review review) throws HibernateException {
        return super.getOneById(review.getIdReview());   //peticion del ID 
    }

    
     

}
