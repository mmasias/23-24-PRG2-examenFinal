import java.util.Scanner;

public class Menu {

    private final String[] INGREDIENTES = new String[] {
            "1. Pan brioche",
            "2. Pan integral",
            "3. Carne poco hecha",
            "4. Carne medio hecha",
            "5. Carne muy hecha",
            "6. Res",
            "7. Pollo",
            "8. Queso cheddar",
            "9. Queso azul",
            "10. Huevo ",
            "11. Salsa Mayonesa",
            "12. Salsa ketchup",

    };

    private final Intervalo OPCIONES = new Intervalo(1, 12);

    public void mostrar() {
        System.out.println("OPCIONES>");
        for (String ingredientes : INGREDIENTES) {
            System.out.println(ingredientes);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige las opciones (1, 2, 3, ...):");
        String input = scanner.nextLine();

        String[] options = input.split(",");
        int[] chosenOptions = new int[options.length];

        for (int i = 0; i < options.length; i++) {
            chosenOptions[i] = Integer.parseInt(options[i].trim());
        }

        for (int option : chosenOptions) {
            System.out.println("Elegiste la hamburguesa con " + option);
        }
    }
}





