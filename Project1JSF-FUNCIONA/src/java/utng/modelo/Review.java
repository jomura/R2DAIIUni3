package utng.modelo;                                                            //TABLA CON 4 COLUMNAS 

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="revisado")                                               //nombre de la tabla en postgres
public class Review implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idReview")                                            //nombre de la primera columna (ID)
    private Long idReview;                                                  //identificador del ID
    
    @Column (length = 30 )
    private String documentKey;                                                      //nombre e identificador de la segunda columna
    
    @Column (length = 30 )
    private String creationDate ;                                                      //nombre e identificador de la tercera columna
    
    @Column (length = 30 )
    private String userKey ;                                                      //nombre e identificador de la cuarta columna
    
    @Column (length = 30 )
    private String ranting ;                                                      //nombre e identificador de la quinta columna
    
    @Column (length = 30 )
    private String comments ;                                                      //nombre e identificador de la sexta columna
    
    @Column (length = 30 )
    private String data ;                                                      //nombre e identificador de la septima columna
    
    public Review(){
        this.idReview=0L;                                                   //establecer automaticamente la ID dentro de la BD
    } 

    //GETERS AND SETERS

    public Long getIdReview() {
        return idReview;
    }

    public void setIdReview(Long idReview) {
        this.idReview = idReview;
    }

    public String getDocumentKey() {
        return documentKey;
    }

    public void setDocumentKey(String documentKey) {
        this.documentKey = documentKey;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getRanting() {
        return ranting;
    }

    public void setRanting(String ranting) {
        this.ranting = ranting;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    
    
    
}
