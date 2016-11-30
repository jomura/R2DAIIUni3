package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Author;

public class AuthorDAO extends DAO<Author>{

    public AuthorDAO() {
        super(new Author());
    }

    protected Author getOneById(Author author) throws HibernateException {
        return super.getOneById(author.getIdAuthor());   //peticion del ID 
    }

    
     

}
