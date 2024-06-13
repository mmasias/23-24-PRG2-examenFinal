public class Hamburguesa {
    Pan tope;
    Pan fondo;
    Carne carne;
    Extra[] extras;
    int numExtras;

    public Hamburguesa(Pan tope, Pan fondo, Carne carne, int numExtras) {
        this.tope = tope;
        this.fondo = fondo;
        this.carne = carne;
        this.numExtras = numExtras;
        this.extras = new Extra[numExtras];
    }

    public void agregarExtra(Extra extra){
        for(int i = 0; i < numExtras; i++){
            if(extras[i] == null){
                extras[i] = extra;
                break;
            }
        }
    }

    public void describir(){
        tope.describir();
        carne.describir();
        for(int i = 0; i<numExtras; i++){
            extras[i].describir();
            if(i != numExtras-1){
                System.out.print(", ");
            } else {
                System.out.println("!!!!!");
            }
        }
    }
    public void representar(){
        tope.representar();
        carne.representar();
        for(int i = 0; i<numExtras; i++){
            extras[i].representar();
        }
        fondo.representar();
    }
}
