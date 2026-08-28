public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Christian Ataulluco", 1001, 16.5,48154245);
        Estudiante e2 = new Estudiante("jesus Davila", 1002, 14.0,48154246);
        Estudiante e3 = new Estudiante("Alfredo Soto",  1003, 18.0,48154247);
 
        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
 
        System.out.println("Total estudiantes: " + Estudiante.getTotalEstudiantes());
    }
}
