
package generadordodumentos;


abstract class Documento {
    
    abstract GeneradorDocumento crearGeneradorDocumento();
    
     void crearDocumento() {
       GeneradorDocumento documentGenerator = crearGeneradorDocumento();
        System.out.println("Creando un nuevo documento...");
        documentGenerator.generarDocumento();
    }

    
}
