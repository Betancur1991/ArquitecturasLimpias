//clase que implementa el principio de abierto cerrado

public interface Descuento {
    public double aplicarDescuento(double monto);
}


public class DescuentoEstudiante implements Descuento{
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.8;
    }
}


public class DescuentoRegular implements Descuento{
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9;
    }
}


public class DescuentoSenior implements Descuento{
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.7;
    }
}



public class CalculadoraDescuento {

    private Descuento descuento;

    public CalculadoraDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public double calcular(double monto) {
        return descuento.aplicarDescuento(monto);
    }

    public static void main(String[] args) {
        
        CalculadoraDescuento calculadoraEstudiante = new CalculadoraDescuento(new DescuentoEstudiante());
        double totalEstudiante = calculadoraEstudiante.calcular(100.0);
        System.out.println("Total con descuento de estudiante: $" + totalEstudiante);

        CalculadoraDescuento calculadoraSenior = new CalculadoraDescuento(new DescuentoSenior());
        double totalSenior = calculadoraSenior.calcular(100.0);
        System.out.println("Total con descuento senior: $" + totalSenior);

        CalculadoraDescuento calculadoraRegular = new CalculadoraDescuento(new DescuentoRegular());
        double totalRegular = calculadoraRegular.calcular(100.0);
        System.out.println("Total con descuento regular: $" + totalRegular);
    }
}

