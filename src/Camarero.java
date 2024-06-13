public class Camarero extends Empleado{

    public void recibir(Hamburguesa hamburguesa){
        System.out.print("Sale una ");
        hamburguesa.describir();
        this.hamburguesa=hamburguesa;
        this.tieneHamburguesa=true;
    }

    public void servir(){
        hamburguesa.representar();
        this.tieneHamburguesa=false;
    }
}
