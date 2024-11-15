public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String obtenerDetalles() {
        return nombre + ", " + puesto + ", Salario: " + salario;
    }

    public String generarInforme() {
        return "Informe del Empleado: " + obtenerDetalles();
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Rodrigo Silva", "Ingeniero de Software", 90000);
        String informe = empleado.generarInforme();
        System.out.println(informe);
    }
}
