public class Ketchup extends Extra{
    private String representacion = " ooOooOooOooO";
    private String cantidad;
    public Ketchup(String cantidad) {
        this.cantidad=cantidad;
    }

    @Override
    void describir() {
        System.out.print(cantidad + " de Ketchup");
    }

    @Override
    void representar() {
        System.out.println(representacion);
    }
}
