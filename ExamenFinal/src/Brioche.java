public class Brioche extends Pan{
    String representacion = "##############";

    @Override
    void describir() {
        System.out.print("Brioche, ");
    }

    @Override
    void representar() {
        System.out.println(representacion);;
    }
}
