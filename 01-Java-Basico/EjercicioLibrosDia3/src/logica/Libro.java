
package logica;


public class Libro {
    
    /*codigo ISBN, título, autor, género, número de páginas.*/
    int codigoIsbn;
    String titulo;
    String autor;
    String genero;
    int numeroDePaginas;

    public Libro() {
    }

    public Libro(int codigoIsbn, String titulo, String autor, String genero, int numeroDePaginas) {
        this.codigoIsbn = codigoIsbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(int codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigoIsbn=" + codigoIsbn + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    
    
    
}
