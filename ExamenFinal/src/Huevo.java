public class Huevo extends Extra{
    String representacion = " ~-~-(  )~-~-";
    @Override
    void describir() {
        System.out.print("Huevo frito");
    }

    @Override
    void representar() {
        System.out.println(representacion);
    }
}
