package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="grupo")
public class Grupo implements Serializable{
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "id_grupo")
    private Long idGrupo;
    @Column(name="nombre_grupo", length = 10)
    private String nombreGrupo;
    @Column (length = 10)
    private String alumnos;
    @Column (length = 15)
    private String cuatrimestre;
    @ManyToOne
    @JoinColumn(name = "id_docente")
    private Docente docente;

    public Grupo(Long idGrupo, String nombreGrupo, String alumnos, String cuatrimestre, Docente docente) {
        super();
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
        this.alumnos = alumnos;
        this.cuatrimestre = cuatrimestre;
        this.docente = docente;
    }

    public Grupo() {
        this.idGrupo=0L;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
   
}
