public class Estudiante {

    private String nombre;
    private Curso[] cursos;

    public Estudiante(String nombre, int numeroDeCursos) {
        this.nombre = nombre;
        this.cursos = new Curso[numeroDeCursos]; //inicializando arreglo.
    }

    public String getNombre() {
        return nombre;
    }
    public Curso[] getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso, int indice) {
        this.cursos[indice] = curso;
    }

    public void mostrarCursos() {
        System.out.println("Cursos de " + this.nombre + ":");
        for (Curso curso : cursos) {
            if (curso != null) {
                System.out.println("- " + curso.getTitulo());
            }
        }
    }
}
