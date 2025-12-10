public class App {
    public static void main(String[] args) throws Exception {
        
       Empleado emp1 = new Empleado("Juan Perez", 2500.0);
       Empleado emp2 = new Empleado("Ana Gomez", 3000.0);
        Empleado emp3 = new Empleado("Luis Martinez", 2800.0);

        Empleado[] empleadosIT = {emp1, emp2};
        Departamento departamentoIT = new Departamento("Tecnologia de la Informacion", empleadosIT); //relación de agregación

        

    }
}
