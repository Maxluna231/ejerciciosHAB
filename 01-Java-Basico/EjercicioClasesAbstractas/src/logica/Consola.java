
package logica;

public abstract class Consola {
   private String codigo_consola;
   private String nombre;
   private String empresaDesarrollo;
   private String anio;

    protected Consola() {
    }

    protected Consola(String codigo_consola, String nombre, String empresaDesarrollo, String anio) {
        this.codigo_consola = codigo_consola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anio = anio;
    }

    public String getCodigo_consola() {
        return codigo_consola;
    }

    public void setCodigo_consola(String codigo_consola) {
        this.codigo_consola = codigo_consola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public String getAnio() {
        return anio;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

   protected abstract void cargarJuego();

   
   
  
      
   
}
