public class Mayonesa extends Extra{
    private String representacion = " ~=~~=~~=~~=~";
    private String cantidad;

    public Mayonesa(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    void describir() {
        System.out.print(cantidad + " de Mayonesa");
    }

    @Override
    void representar() {
        System.out.println(representacion);
    }
}
