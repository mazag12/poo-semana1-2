
import java.util.List;

// Estudiante.java — clase creada en Semana 2
public class Estudiante {

    // Atributos de instancia (privados - encapsulamiento)
    private final String nombre;
    private final int codigo;
    private final double nota;

    // Variable STATIC: compartida por todos los objetos
    private static int totalEstudiantes = 0;

    // Constructor
    public Estudiante(String nombre, int codigo, double nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota = nota;
        totalEstudiantes++; // se incrementa en cada objeto creado
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public int getCodigo() {
        return codigo;
    }

    // Método static
    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    // Muestra información del estudiante
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
        System.out.println("Código: " + codigo);
    }
     // separa a 2 alumnos del grupo
    public static void separarAlumnos(List<Estudiante> estudiantes) {

        if (estudiantes != null && estudiantes.size() >= 2) {
            for (Estudiante estudiante : estudiantes) {
                System.out.println("========Alumno " + (estudiantes.indexOf(estudiante) + 1) + "============");
                estudiante.mostrarInfo();
            }
        }
    }
}
