package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Location;

public class LocationDAO extends DAO<Location>{

    public LocationDAO() {
        super(new Location());
    }

    protected Location getOneById(Location location) throws HibernateException {
        return super.getOneById(location.getIdLocation());   //peticion del ID 
    }

    
     

}
