package Salsa;

public class CantidadSalsa {
    private String nombre;

    public CantidadSalsa(String nivel) {
        setNivel(nivel);
    }

    public void setMucho() {
        nombre = "Mucho";
    }

    public void setPoco() {
        nombre = "Poco";
    }

    public void setNivel(String nivel) {
        if (nivel.equalsIgnoreCase("Mucho")) {
            setMucho();
        } else if (nivel.equalsIgnoreCase("Poco")) {
            setPoco();
        } else {
            nombre = "Indefinido"; 
        }
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        CantidadSalsa salsa1 = new CantidadSalsa("Mucho");
        System.out.println("Nivel de salsa: " + salsa1.getNombre());

        CantidadSalsa salsa2 = new CantidadSalsa("Poco");
        System.out.println("Nivel de salsa: " + salsa2.getNombre());

        CantidadSalsa salsa3 = new CantidadSalsa("Medio");
        System.out.println("Nivel de salsa: " + salsa3.getNombre());

        salsa3.setNivel("Mucho");
        System.out.println("Nivel de salsa: " + salsa3.getNombre());
    }
}
