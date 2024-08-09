
package marjoriecabreraparcial1progra2;


public class Curso {
    private int id;
    private String titulo;
    private int numAlumnos;
    private int creditos;
    private String catedraticoID;
    
    
   
    
    
  public Curso(int id, String titulo, int numAlumnos, int creditos, String catedraticoID) {
        this.id = id;
        this.titulo = titulo;
        this.numAlumnos = numAlumnos;
        this.creditos = creditos;
        this.catedraticoID = catedraticoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCatedraticoID() {
        return catedraticoID;
    }

    public void setCatedraticoID(String catedraticoID) {
        this.catedraticoID = catedraticoID;
    }
    
    
    
    
    
    public void imprimirCurso() {
        System.out.println(" ID: " + id);
        System.out.println(" Titulo: " + titulo);
        System.out.println(" Numero de Alumnos: " + numAlumnos);
        System.out.println(" Creditos: " + creditos);
        System.out.println(" Catedratico ID: " + catedraticoID);
        System.out.println("\n ");
    }
}

