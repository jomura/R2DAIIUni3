package utng.datos;

import java.io.Serializable;
import org.hibernate.HibernateException;
import utng.modelo.Grupo;


public class GrupoDAO extends DAO<Grupo>{

    public GrupoDAO() {
        super(new Grupo());
    }

    
    protected Grupo getOneById(Grupo grupo) 
            throws HibernateException {
        return super.getOneById(grupo.getIdGrupo()); 
    }

    
    
    
    
}
