public class Departamento {
    private String nombre;
    private Empleado[] empleados;

    public Departamento(String nombre, Empleado[] empleados) {  //relacion de agregación
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }
}
