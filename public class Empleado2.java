//clase implementando el principio de responsabilidad unica

public class Empleado2 {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
}



public class FormatoInformeEmpleado {
    public String formatearInforme(Empleado empleado) {
        return "Informe del Empleado:\n" +
                "Nombre: " + empleado.getNombre() + "\n" +
                "Puesto: " + empleado.getPuesto() + "\n" +
                "Salario: $" + empleado.getSalario();
    }
}



public class GeneradorInformesEmpleado {
    private FormatoInformeEmpleado formatoInformeEmpleado;

    public GeneradorInformesEmpleado(FormatoInformeEmpleado formatoInformeEmpleado) {
        this.formatoInformeEmpleado = formatoInformeEmpleado;
    }

    public String generarInforme(Empleado empleado) {
        return formatoInformeEmpleado.formatearInforme(empleado);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Rodrigo Silva", "Ingeniero de Software", 90000);
        FormatoInformeEmpleado formato = new FormatoInformeEmpleado();
        GeneradorInformesEmpleado generador = new GeneradorInformesEmpleado(formato);

        String informe = generador.generarInforme(empleado);
        System.out.println(informe);
    }
}

