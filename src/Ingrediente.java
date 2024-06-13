public abstract class Ingrediente {
    String representacion;

    abstract void describir();

    public void representar(){
        System.out.println(representacion);
    }

}
