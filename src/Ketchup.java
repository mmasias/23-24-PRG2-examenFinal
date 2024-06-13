public class Ketchup extends Extra{
    private String cantidad;

    public Ketchup(String cantidad) {
        this.cantidad=cantidad;
        representacion = " ooOooOooOooO";
    }

    @Override
    void describir() {
        System.out.print(cantidad + " de Ketchup");
    }

}
