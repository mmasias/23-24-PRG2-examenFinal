package Coccion;

public class CarneCoccion {
    private String tipo;

    public CarneCoccion(String tipo) {
        this.tipo = tipo;
    }

    public void setPocoHecha() {
        tipo = "Poco Hecha";
    }

    public void setMedioHecha() {
        tipo = "Medio Hecha";
    }

    public void setMuyHecha() {
        tipo = "Muy Hecha";
    }

    public String getTipo() {
        return tipo;
    }

    public static void main(String[] args) {
        CarneCoccion carne = new CarneCoccion("Cruda");
        System.out.println(carne.getTipo()); 

        carne.setPocoHecha();
        System.out.println(carne.getTipo()); 

        carne.setMedioHecha();
        System.out.println(carne.getTipo()); 

        carne.setMuyHecha();
        System.out.println(carne.getTipo());
    }
}
