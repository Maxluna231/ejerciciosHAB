
package logica;

public class XboxOne extends Consola{
   private boolean conectadoInternet;
   private boolean calidad4K;
   private boolean descargaActualizacion;

    public XboxOne() {
    }

    public XboxOne(boolean conectadoInternet, boolean calidad4K, boolean descargaActualizacion, String codigo_consola, String nombre, String empresaDesarrollo, String anio) {
        super(codigo_consola, nombre, empresaDesarrollo, anio);
        this.conectadoInternet = conectadoInternet;
        this.calidad4K = calidad4K;
        this.descargaActualizacion = descargaActualizacion;
    }

    public boolean isConectadoInternet() {
        return conectadoInternet;
    }

    public void setConectadoInternet(boolean conectadoInternet) {
        this.conectadoInternet = conectadoInternet;
    }

    public boolean isCalidad4K() {
        return calidad4K;
    }

    public void setCalidad4K(boolean calidad4K) {
        this.calidad4K = calidad4K;
    }

    public boolean isDescargaActualizacion() {
        return descargaActualizacion;
    }

    public void setDescargaActualizacion(boolean descargaActualizacion) {
        this.descargaActualizacion = descargaActualizacion;
    }

   

   @Override
    public void cargarJuego(){
        System.out.println("Cargando juego en XBOX ONE. Por favor espere");
    }
    
    public void leerJuegoDigital(String juego){
        System.out.println("Leyendo" + juego + " desde Tienda");
    }
    
}
