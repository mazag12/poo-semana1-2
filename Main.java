
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Christian Mamani", 1001, 16.5);
        Estudiante e2 = new Estudiante("jesus Davila", 1002, 14.0);
        Estudiante e3 = new Estudiante("Alfredo Soto",  1003, 18.0);
        Estudiante e4 = new Estudiante("Rosa Rojas",  1005, 15.0);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes.add(e4);

        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
            estudiante.getCodigo();
        }
 
        System.out.println("Total estudiantes: " + Estudiante.getTotalEstudiantes());
        Estudiante.separarAlumnos(estudiantes);
    }

}
