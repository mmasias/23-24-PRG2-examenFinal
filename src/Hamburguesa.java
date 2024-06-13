import java.util.Scanner;

class Hamburguesa {
    private String pan;
    private String carne;
    private String queso;
    private String huevo;
    private String salsa;
    private String extras;

    public Hamburguesa(String pan, String carne, String queso, String huevo, String salsa, String extras) {
        this.pan = pan;
        this.carne = carne;
        this.queso = queso;
        this.huevo = huevo;
        this.salsa = salsa;
        this.extras = extras;
    }

    public void mostrarHamburguesa() {
        System.out.println(pan);
        System.out.println(carne);
        System.out.println(queso);
        System.out.println(huevo);
        System.out.println(salsa);
        System.out.println(extras);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el tipo de pan:");
        System.out.println("1. Brioche");
        System.out.println("2. Integral");
        int panOption = scanner.nextInt();
        String pan;
        switch (panOption) {
            case 1:
                pan = "##############";
                break;
            case 2:
                pan = "||||||||||||||";
                break;
        }

        System.out.println("Elige la carne:");
        int carneOption = scanner.nextInt();
        String carne;
        switch (carneOption) {
            case 1:
                System.out.println("Elige la cocción de la carne:");
                System.out.println("1. Poco hecho");
                System.out.println("2. Muy hecho");
                System.out.println("3. Medio hecho");
                int carneCookOption = scanner.nextInt();
                switch (carneCookOption) {
                    case 1:
                        carne = "Poco hecho";
                        break;
                    case 2:
                        carne = "Muy hecho";
                        break;
                    case 3:
                        carne = "Medio hecho";
                        break;
                }
                break;
        }

        System.out.println("Elige el queso:");
        System.out.println("1. Queso Cheddar");
        System.out.println("2. Queso Azul");
        int quesoOption = scanner.nextInt();
        String queso;
        switch (quesoOption) {
            case 1:
                queso = "============";
                break;
            case 2:
                queso = "-.-.-.-.-.-.";
                break;
        }

        System.out.println("Elige la salsa:");
        System.out.println("1. Salsa Mayonesa");
        System.out.println("2. Salsa Ketchup");
        int salsaOption = scanner.nextInt();
        String salsa;
        switch (salsaOption) {
            case 1:
                salsa = "~=~~=~~=~~=~";
                break;
            case 2:
                salsa = "ooOooOooOooO";
                break;

        }

        System.out.println("Elige los extras:");
        int extrasOption = scanner.nextInt();
        String extras;
        switch (extrasOption) {
            case 1:
                System.out.println("Elige los extras:");
                System.out.println("1. Queso Cheddar");
                System.out.println("2. Queso Azul");
                System.out.println("3. Huevo");
                int extrasOption2 = scanner.nextInt();
                switch (extrasOption2) {
                    case 1:
                        extras = "============";
                        break;
                    case 2:
                        extras = "-.-.-.-.-.-.";
                        break;
                    case 3:
                        extras = "~-~-(  )~-~-";
                        break;
                }
                break;
        }

        Hamburguesa hamburguesa = new Hamburguesa(pan, carne, queso, huevo, salsa, extras);
        hamburguesa.mostrarHamburguesa();
    }
}