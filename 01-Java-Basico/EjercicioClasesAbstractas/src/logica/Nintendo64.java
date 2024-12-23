
package logica;

public class Nintendo64 extends Consola{
    private String norma;
    private boolean leerCartuchosPiratas;

    public Nintendo64() {
    }

    
    
    public Nintendo64(String norma, boolean leerCartuchosPiratas, String codigo_consola, String nombre, String empresaDesarrollo, String anio) {
        super(codigo_consola, nombre, empresaDesarrollo, anio);
        this.norma = norma;
        this.leerCartuchosPiratas = leerCartuchosPiratas;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isLeerCartuchosPiratas() {
        return leerCartuchosPiratas;
    }

    public void setLeerCartuchosPiratas(boolean leerCartuchosPiratas) {
        this.leerCartuchosPiratas = leerCartuchosPiratas;
    }

    
      @Override
    public void cargarJuego() {
        System.out.println("Cargando juego. Por favor espere...");
    }

    
    public void leerCartucho(String juego){
        System.out.println("Leyendo Cartucho " + juego );
    }

    @Override
    public String toString() {
        return "Nintengo64{" + "norma=" + norma + ", leerCartuchosPiratas=" + leerCartuchosPiratas + '}';
    }
    
    
    
}
