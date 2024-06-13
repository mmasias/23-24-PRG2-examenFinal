public class Res extends Carne{
    String representacion=" ::::::::::::";

    private String coccion;
    public Res(String coccion) { this.coccion = coccion; }

    @Override
    void describir() { System.out.print("Res ("+coccion+"), "); }

    @Override
    void representar() { System.out.println(representacion);}
}
