public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante("Ana", 2);
        Estudiante estudiante2 = new Estudiante("Luis", 2);
        Curso curso1 = new Curso("Matemáticas", 2);

        estudiante1.agregarCurso(curso1, 0); //relación bidireccional
        curso1.agregarEstudiante(estudiante1, 0);


        estudiante2.agregarCurso(curso1, 1);
        curso1.agregarEstudiante(estudiante2, 1);

        estudiante1.mostrarCursos();
        curso1.mostrarEstudiantes();

        estudiante2.mostrarCursos();
    }
}
