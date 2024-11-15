//clase que no implementa el Principio de Sustitución de Liskov

public class Ave {
        public String volar() {
            return "Estoy volando";
        }
}


class Pinguino extends Ave {
    @Override
    public String volar() {
        throw new UnsupportedOperationException("Los pingüinos no pueden volar");
    }
}

public class Main {
    public static void main(String[] args) {
        Pinguino pinguino = new Pinguino();
        try {
            System.out.println(pinguino.volar());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}