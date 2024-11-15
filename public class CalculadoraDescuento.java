//clase que no implementa el principio de abierto cerrado

public class CalculadoraDescuento {

    public double calcular(String tipoCliente, double monto) {
        switch (tipoCliente.toLowerCase()) {
            case "estudiante":
                return monto * 0.8;
            case "senior":
                return monto * 0.7;
            case "regular":
                return monto * 0.9;
            default:
                return monto;
        }
    }

    public static void main(String[] args) {
        CalculadoraDescuento calculadora = new CalculadoraDescuento();
        double total = calculadora.calcular("estudiante", 100.0); // Ejemplo con monto 100
        System.out.println("Total con descuento: $" + total);
    }
}

