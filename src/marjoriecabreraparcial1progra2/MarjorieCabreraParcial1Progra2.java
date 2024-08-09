
package marjoriecabreraparcial1progra2;


public class MarjorieCabreraParcial1Progra2 {

    
    public static void main(String[] args) {
        //se crea un catedratico
        Catedratico catedratico1 = new Catedratico(1, " Juan Perez ", " 1234567891801 ", " 15 calle, 13 avenida ", " 5545-1234 ", " CAT001 ", " Auditor ");
        Catedratico catedratico2 = new Catedratico(2, " Pablo Marmol ", " 224566221802 ", " 15 calle 3ave. ", " 0984-2458 ", " CAT002 ", " Ingeniero Civil " );
        Catedratico catedratico3 = new Catedratico(3, " Jesus Pineda ", "0923577991801", "22 calle 22 ave. ", " 9089-2233 ", " CAT003 ", " Ingeniero en Sistemas" );
        
        
        
        // se crea algunos cursos
        Curso curso1 = new Curso(1, " Matematicas ", 3, 4, " CAT001 ");
        Curso curso2 = new Curso(2, " Fisica ", 2, 3, " CAT002 ");
        Curso curso3 = new Curso(3, " Programacion ", 2, 4, " CAT003 ");
        
        
        // asignar cursos al catedratico
        System.out.println("-------------------------");
        System.out.println("\n Catedraticos y Cursos: ");
        System.out.println("-------------------------");
        catedratico1.asignarCurso(curso1);
        catedratico2.asignarCurso(curso2);
        catedratico3.asignarCurso(curso3);
        
        
        // mostrar los datos del catedratico y los cursos que da
        System.out.println("-------------------------");
        System.out.println("\n Catedratico: ");
        System.out.println("-------------------------");
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();
        System.out.println("-------------------------");
        System.out.println("\n Cusrsos: ");      
        System.out.println("-------------------------");
        curso1.imprimirCurso();
        curso2.imprimirCurso();
        curso3.imprimirCurso();
                
        
      
        
        // se crea un alumno
        System.out.println("-------------------------");
        System.out.println("\n Alumnos: ");
        Alumno alumno1 = new Alumno(1, " Maria Lopez ", " 20200101 ", " 16 calle avenida jerusalen ", " 5564-5322 ", " 21 ");
        Alumno alumno2 = new Alumno(2," Osmar Guerra"," 20200024"," 20 calle, 4ta ave.", "0987-2345"," 34 " );
        Alumno alumno3 = new Alumno(3, "Josefina Morales del Rio Dulce", " 09782345", " Calle a las Escobas ", " 9089-2314 ", "25");
        System.out.println("-------------------------");
        
        
        // inscribir alumno en cursos
        alumno1.inscribirseCurso(curso1);
        alumno1.inscribirseCurso(curso2);
        
        
        alumno2.inscribirseCurso(curso2);
        alumno3.inscribirseCurso(curso3);
        
        
        
        // mostrar los datos del alumno
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
        
        
        // crear asignaciones
        Asignacion asignacion1 = new Asignacion(alumno1, curso1, curso1.getTitulo());
        Asignacion asignacion2 = new Asignacion(alumno1, curso2, curso2.getTitulo());
        
        Asignacion asignacion3 = new Asignacion(alumno2,curso2,curso2.getTitulo());
        Asignacion asignacion4 = new Asignacion(alumno3, curso3, curso3.getTitulo());
        
        
        
        
        // imprimir asignaciones
        System.out.println("-------------------------");
        System.out.println("\n Asignaciones: ");
        System.out.println("-------------------------");
        asignacion1.imprimirAsignacion();
        asignacion2.imprimirAsignacion();      
        asignacion3.imprimirAsignacion();
        asignacion4.imprimirAsignacion();
        System.out.println("-------------------------");
        
        
        
    }
    
}
