package utng.datos;

import java.io.Serializable;
import org.hibernate.HibernateException;
import utng.modelo.Ganador;


public class GanadorDAO extends DAO<Ganador>{

    public GanadorDAO() {
        super(new Ganador());
    }

    
    protected Ganador getOneById(Ganador ganador) 
            throws HibernateException {
        return super.getOneById(ganador.getIdGanador());   //peticion del ID
    }

    
    
    
    
}
