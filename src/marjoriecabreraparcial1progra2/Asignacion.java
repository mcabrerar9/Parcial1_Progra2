
package marjoriecabreraparcial1progra2;


public class Asignacion {
    private Alumno alumno;
    private Curso curso;
    private String nombreCurso;
    
    
    
    public Asignacion(Alumno alumno, Curso curso, String nombreCurso) {
        this.alumno = alumno;
        this.curso = curso;
        this.nombreCurso = nombreCurso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    
    public void imprimirAsignacion() {
        System.out.println(" Alumno: " + alumno.getNombre());
        System.out.println(" Curso: " + nombreCurso);
        System.out.println("\n ");
    }
}
