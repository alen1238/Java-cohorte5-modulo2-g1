public class Curso {
    private String titulo;
    private Estudiante[] estudiantes; //este curso debe tener varii estudiantes

    public Curso(String titulo, int numeroDeEstudiantes) { //este parametro dice que este curso tiene un limite de estudiantes.
        this.titulo = titulo;
        this.estudiantes = new Estudiante[numeroDeEstudiantes]; // inicializando arreglo.
    }

    public String getTitulo() {
        return titulo;
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante, int indice) {
        this.estudiantes[indice] = estudiante;
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el curso " + this.titulo + ":");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                System.out.println("- " + estudiante.getNombre());
            }
        }
    }

}
