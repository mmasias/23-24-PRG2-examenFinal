import Coccion.CarneCoccion;

public class Carne {
    private String nombre;
    private String vista;
    private CarneCoccion coccion;

    public Carne(String tipo, String nuevaCarne) {
        this.coccion = new CarneCoccion(tipo);
        setNombreVista(nuevaCarne);
    }

    private void setNombreVista(String nuevaCarne) {
        if (nuevaCarne.equalsIgnoreCase("Res")) {
            nombre = "Res";
            vista = "::::::::::::";
        } else if (nuevaCarne.equalsIgnoreCase("Pollo")) {
            nombre = "Pollo";
            vista = ";;;;;;;;;;;;";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getVista() {
        return vista;
    }

    public String getCoccionTipo() {
        return coccion.getTipo();
    }

    public static void main(String[] args) {
        Carne res = new Carne("Poco Hecha", "Res");
        System.out.println("Nombre: " + res.getNombre());
        System.out.println("Vista: " + res.getVista());
        System.out.println("Cocción: " + res.getCoccionTipo());

        Carne pollo = new Carne("Medio Hecha", "Pollo");
        System.out.println("Nombre: " + pollo.getNombre());
        System.out.println("Vista: " + pollo.getVista());
        System.out.println("Cocción: " + pollo.getCoccionTipo());
    }
}
