package utng.modelo;                                                            //TABLA CON 5 COLUMNAS (FK)

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="ganador")                                               //nombre de la tabla
public class Ganador implements Serializable{
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "id_ganador")                                             //nombre de la primera columna (ID)
    private Long idGanador;                                                  //identificador del ID
    @Column( length = 10)                                                       
    private String partido;                                                        //nombre e identificador de la segunda columna
    @Column (length = 10)
    private String fecha;                                                       //nombre e identificador de la tercera columna
    @Column (length = 15)
    private String nombre;                                                       //nombre e identificador de la cuarta columna
    @ManyToOne
    @JoinColumn(name = "id_juego")                                         //nombre EXACTO de la columna de ID de la tabla de 4 columnas
    private Juego juego;                                              //identificador de la FK
    
    public Ganador(){
         this.idGanador=0L;                                                  //establecer automaticamente la ID dentro de la BD
    }
    
    //constructor, geters and seters de todod

    public Ganador(Long idGanador, String partido, String fecha, String nombre, Juego juego) {
        this.idGanador = idGanador;
        this.partido = partido;
        this.fecha = fecha;
        this.nombre = nombre;
        this.juego = juego;
    }

    public Long getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(Long idGanador) {
        this.idGanador = idGanador;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String Partido) {
        this.partido = Partido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    
    
   
}
