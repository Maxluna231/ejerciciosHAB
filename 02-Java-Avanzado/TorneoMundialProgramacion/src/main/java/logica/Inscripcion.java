
package logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Inscripcion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscripcion;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "programador_id")
    private Programador programador;

    // Getters y Setters
    public Long getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(Long numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Programador getProgramador() {
        return programador;
    }

    public void setProgramador(Programador programador) {
        this.programador = programador;
    }
    
    
    
}
