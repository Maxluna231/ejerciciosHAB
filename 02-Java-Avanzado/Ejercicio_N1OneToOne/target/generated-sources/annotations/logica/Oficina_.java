package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Director;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-10T00:20:35", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Oficina.class)
public class Oficina_ { 

    public static volatile SingularAttribute<Oficina, String> piso;
    public static volatile SingularAttribute<Oficina, Long> numOficina;
    public static volatile SingularAttribute<Oficina, Director> unDirector;
    public static volatile SingularAttribute<Oficina, String> edificio;

}