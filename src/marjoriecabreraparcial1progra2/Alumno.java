
package marjoriecabreraparcial1progra2;


public class Alumno {
    private int id;
    private String nombre;
    private String carnet;
    private String direccion;
    private String telefono;
    private String edad;
    
  
    
    public Alumno(int id, String nombre, String carnet, String direccion, String telefono, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.carnet = carnet;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
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

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    
    public void inscribirseCurso(Curso curso) {
        
        
    }
    
 
    
    public void imprimirDatos() {
        System.out.println(" ID: " + id);
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Carnet: " + carnet);
        System.out.println(" Direccion: " + direccion);
        System.out.println(" Telefono: " + telefono);
        System.out.println(" Edad: " + edad);
        System.out.println("\n ");
    }
}
