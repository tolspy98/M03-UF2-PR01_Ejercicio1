import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {

        Perfil perfil = new Perfil(
                "Rubén Sánchez",
                "Desde pequeño que me gustan los ordenadores y ahí sigo",
                new String[] {"💻Programar (Aunque se me dé regular)", "🎮Jugar (Aunque se me dé regular)", "🍳Cocinar (Aunque se me dé regular)"},
                new String[] {"🍕Pizza", "🍔Hamburguesa", "🍨Helado"},
                new String[] {"Me encantan los gatos🐈 (Aunque soy alérgico)", "Me encantan los perros🐕 (Aunque soy alérgico)", "🔥Siempre se me queman los huevos, pero uno se acostumbra al sabor"}
        );

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu AboutMe [" + perfil.getName() + "]");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Fact");
            System.out.println("[4] Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("\nHistoria:\n" + perfil.getStory());
                case 2 -> {
                    System.out.println("\nFavorites:");
                    System.out.println(perfil.getFormattedHobbies());
                    System.out.println(perfil.getFormattedFoods());
                }
                case 3 -> {
                    Random random = new Random();
                    String[] funFacts = perfil.getFunFacts();
                    String randomFact = funFacts[random.nextInt(funFacts.length)];
                    System.out.println("\nFun Fact:\n" + randomFact);
                }
                case 4 -> {
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    running = false;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

    }

}