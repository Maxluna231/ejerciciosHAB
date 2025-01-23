
package generadordodumentos;

public class WordDocumento extends Documento{

    @Override
    GeneradorDocumento crearGeneradorDocumento() {
     return new WordGenerador();
    }
    
}
