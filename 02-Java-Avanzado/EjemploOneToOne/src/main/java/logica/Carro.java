
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
public class Carro implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long num_motor; 
    private String modelo;
    private String marca;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_propietario", referencedColumnName = "id")
    private Propietario unPropietario;

    public Carro(Long num_motor, String modelo, String marca, Propietario unPropietario) {
        this.num_motor = num_motor;
        this.modelo = modelo;
        this.marca = marca;
        this.unPropietario = unPropietario;
    }

    public Carro() {
    }

    public Long getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(Long num_motor) {
        this.num_motor = num_motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Propietario getUnPropietario() {
        return unPropietario;
    }

    public void setUnPropietario(Propietario unPropietario) {
        this.unPropietario = unPropietario;
    }
    
    
    
    
}
