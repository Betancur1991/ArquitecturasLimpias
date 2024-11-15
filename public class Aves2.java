//clase que si implementa el Principio de Sustitución de Liskov

interface Ave {
    String mover();
}

interface AveQueVuela extends Ave {
    String volar();
}

class Ganso implements AveQueVuela {

    @Override
    public String mover() {
        return "Estoy caminando";
    }

    @Override
    public String volar() {
        return "Estoy volando";
    }
}


class Pinguino implements Ave {
    @Override
    public String mover() {
        return "Estoy nadando";
    }

    public static void main(String[] args) {

        Pinguino pinguino = new Pinguino();
        System.out.println(pinguino.mover());

        Ganso ganso = new Ganso();
        System.out.println(ganso.mover());
        System.out.println(ganso.volar());
    }
}