
package generadordodumentos;


public class PdfDocumento extends Documento {

    @Override
    GeneradorDocumento crearGeneradorDocumento() {
     return new PdfGenerador();
    }
    
}
