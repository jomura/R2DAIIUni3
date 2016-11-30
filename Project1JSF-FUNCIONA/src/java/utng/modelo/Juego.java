package utng.modelo;                                                            //TABLA CON 4 COLUMNAS 

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="juego")                                               //nombre de la tabla en postgres
public class Juego implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_juego")                                            //nombre de la primera columna (ID)
    private Long idJuego;                                                  //identificador del ID
    @Column (length = 30 )
    private String equipo1;                                                      //nombre e identificador de la segunda columna
    @Column (length = 30 )
    private String equipo2;                                                      //nombre e identificador de la tercera columna
    @Column (length = 30 )
    private String marcador;                                                      //nombre e identificador de la cuarta columna
    
    public Juego(){
        this.idJuego=0L;                                                   //establecer automaticamente la ID dentro de la BD
    } 

    //GETERS AND SETERS

    public Long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Long idJuego) {
        this.idJuego = idJuego;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    
    
    
    
}
