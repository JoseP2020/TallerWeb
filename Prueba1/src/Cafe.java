interface Cafe {
    double costo();
}

class CafeSimple implements Cafe {
    public double costo() {
        return 5;
    }
}

abstract class DecoradorCafe implements Cafe {
    protected Cafe cafeDecorado;

    public DecoradorCafe(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public double costo() {
        return cafeDecorado.costo();
    }
}


class Leche extends DecoradorCafe {
    public Leche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    public double costo() {
        return super.costo() + 2;
    }
}


class Azucar extends DecoradorCafe {
    public Azucar(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    public double costo() {
        return super.costo() + 1;
    }
}


