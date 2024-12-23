
package logica;

public class PlayStation2 extends Consola {
   private String norma;
   private boolean chipiadaOno;
   private double tamañoMemoryCard;

    public PlayStation2() {
    }

   
   
    public PlayStation2(String norma, boolean chipiadaOno, double tamañoMemoryCard, String codigo_consola, String nombre, String empresaDesarrollo, String anio) {
        super(codigo_consola, nombre, empresaDesarrollo, anio);
        this.norma = norma;
        this.chipiadaOno = chipiadaOno;
        this.tamañoMemoryCard = tamañoMemoryCard;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipiadaOno() {
        return chipiadaOno;
    }

    public void setChipiadaOno(boolean chipiadaOno) {
        this.chipiadaOno = chipiadaOno;
    }

    public double getTamañoMemoryCard() {
        return tamañoMemoryCard;
    }

    public void setTamañoMemoryCard(double tamañoMemoryCard) {
        this.tamañoMemoryCard = tamañoMemoryCard;
    }


  
    @Override
    public void cargarJuego(){
        System.out.println("Cargando juego en PS2. Por favor espere");
    }
    
    public void leerDvd(String juego){
        System.out.println("Leyendo Dvd: " + juego);
    }
   
    public void grabarEnMemory(){
        System.out.println("Se ha guardado correctamente en la memory card; ");
    }
}
