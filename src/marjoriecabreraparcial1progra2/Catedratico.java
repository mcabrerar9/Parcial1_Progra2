
package marjoriecabreraparcial1progra2;

public class Catedratico {
    private int id;
    private String nombre;
    private String dpi;
    private String direccion;
    private String telefono;
    private String catedraticoID;
    private String profesion;
    
    
    
    public Catedratico(int id, String nombre, String dpi, String direccion, String telefono, String catedraticoID, String profesion) {
        this.id = id;
        this.nombre = nombre;
        this.dpi = dpi;
        this.direccion = direccion;
        this.telefono = telefono;
        this.catedraticoID = catedraticoID;
        this.profesion = profesion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCatedraticoID() {
        return catedraticoID;
    }

    public void setCatedraticoID(String catedraticoID) {
        this.catedraticoID = catedraticoID;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
    public void asignarCurso(Curso curso) {
        
        
    }
    
    
    
    public void imprimirDatos() {
        System.out.println(" ID: " + id);
        System.out.println(" Nombre: " + nombre);
        System.out.println(" DPI: " + dpi);
        System.out.println(" Direccion: " + direccion);
        System.out.println(" Telefono: " + telefono);
        System.out.println(" Catedratico ID: " + catedraticoID);
        System.out.println(" Profesion: " + profesion);
        
        System.out.println("\n ");
    }
}
