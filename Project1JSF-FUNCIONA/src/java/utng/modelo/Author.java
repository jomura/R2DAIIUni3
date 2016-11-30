package utng.modelo;                                                            //TABLA CON 4 COLUMNAS 

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="Authors")                                               //nombre de la tabla en postgres
public class Author implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idAuthors")                                            //nombre de la primera columna (ID)
    private Long idAuthor;                                                  //identificador del ID
    
    @Column (length = 30 )
    private String fullName;                                                      //nombre e identificador de la segunda columna
    
    @Column (length = 30 )
    private Long affiliation;                                                      //nombre e identificador de la tercera columna
    
    public Author(){
        this.idAuthor=0L;                                                   //establecer automaticamente la ID dentro de la BD
    } 

    //GETERS AND SETERS

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Long affiliation) {
        this.affiliation = affiliation;
    }


    
    
}
