
package logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Oficina implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numOficina;
    private String edificio;
    private String piso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_director", referencedColumnName = "id")
    private Director unDirector;

    public Oficina() {
    }

    public Oficina(Long numOficina, String edificio, String piso, Director unDirector) {
        this.numOficina = numOficina;
        this.edificio = edificio;
        this.piso = piso;
        this.unDirector = unDirector;
    }

    public Director getUnDirector() {
        return unDirector;
    }

    public void setUnDirector(Director unDirector) {
        this.unDirector = unDirector;
    }

    

    public Long getNumOficina() {
        return numOficina;
    }

    public void setNumOficina(Long numOficina) {
        this.numOficina = numOficina;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
    
    
    
    
}
