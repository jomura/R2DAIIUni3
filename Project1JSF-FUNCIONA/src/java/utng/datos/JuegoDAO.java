package utng.datos;

import java.io.Serializable;
import org.hibernate.HibernateException;
import utng.modelo.Juego;

public class JuegoDAO extends DAO<Juego>{

    public JuegoDAO() {
        super(new Juego());
    }

    protected Juego getOneById(Juego juego) throws HibernateException {
        return super.getOneById(juego.getIdJuego());   //peticion del ID 
    }

    
     

}
