package utng.datos;

import java.io.Serializable;
import org.hibernate.HibernateException;
import utng.modelo.Docente;

public class DocenteDAO extends DAO<Docente>{

    public DocenteDAO() {
        super(new Docente());
    }

    protected Docente getOneById(Docente docente) throws HibernateException {
        return super.getOneById(docente.getIdDocente()); 
    }

    
     

}
