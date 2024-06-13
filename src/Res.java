public class Res extends Carne{

    private String coccion;
    public Res(String coccion) {
        this.coccion = coccion;
        representacion=" ::::::::::::";
    }

    @Override
    void describir() { System.out.print("Res ("+coccion+"), "); }

}
