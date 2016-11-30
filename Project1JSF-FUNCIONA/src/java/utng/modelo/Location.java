package utng.modelo;                                                            //TABLA CON 4 COLUMNAS 

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="Locations")                                               //nombre de la tabla en postgres
public class Location implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idLocation")                                            //nombre de la primera columna (ID)
    private Long idLocation;                                                  //identificador del ID
    
    @Column (length = 30 )
    private String streetAddres;                                                      //nombre e identificador de la segunda columna
    
    @Column (length = 30 )
    private Long postalCode;                                                      //nombre e identificador de la tercera columna
    
    @Column (length = 30 )
    private String city;                                                      //nombre e identificador de la cuarta columna
    
    @Column (length = 30 )
    private String stateProvince ;                                                      //nombre e identificador de la quinta columna
    
    public Location(){
        this.idLocation=0L;                                                   //establecer automaticamente la ID dentro de la BD
    } 

    //GETERS AND SETERS

    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    public String getStreetAddres() {
        return streetAddres;
    }

    public void setStreetAddres(String streetAddres) {
        this.streetAddres = streetAddres;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    
    
}
