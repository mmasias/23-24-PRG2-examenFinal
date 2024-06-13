public class Mayonesa extends Extra{
    private String cantidad;

    public Mayonesa(String cantidad) {
        this.cantidad = cantidad;
        representacion = " ~=~~=~~=~~=~";
    }

    @Override
    void describir() {
        System.out.print(cantidad + " de Mayonesa");
    }

}
