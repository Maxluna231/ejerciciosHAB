
package generadordodumentos;

public class GeneradorDodumentos {

    public static void main(String[] args) {
        
        Documento pdfDocumento = new PdfDocumento();
        pdfDocumento.crearDocumento();
        
        Documento wordDocumento = new WordDocumento();
        wordDocumento.crearDocumento();
    }
    
}
