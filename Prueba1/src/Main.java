public class Main {
    public static void main(String[] args) {
        Cafe cafeSimple = new CafeSimple();
        System.out.println("Café simple: $" + cafeSimple.costo());

        Cafe cafeConLeche = new Leche(cafeSimple);
        System.out.println("Café con leche: $" + cafeConLeche.costo());

        Cafe cafeConAzucar = new Azucar(cafeSimple);
        System.out.println("Café con azúcar: $" + cafeConAzucar.costo());

        Cafe cafeConLecheYAzucar = new Azucar(new Leche(cafeSimple));
        System.out.println("Café con leche y azúcar: $" + cafeConLecheYAzucar.costo());
    }
}