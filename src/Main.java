public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {

        Perfil RubenSanchez = new Perfil(
                "Rubén Sánchez",
                "Desde pequeño que me gustan los ordenadores y ahí sigo",
                new String[] {"💻Programar (Aunque se me dé regular)", "🎮Jugar (Aunque se me dé regular)", "🍳Cocinar (Aunque se me dé regular)"},
                new String[] {"🍕Pizza", "🍔Hamburguesa", "🍨Helado"},
                new String[] {"Me encantan los gatos🐈 (Aunque soy alérgico)", "Me encantan los perros🐕 (Aunque soy alérgico)", "🔥Siempre se me queman los huevos, pero uno se acostumbra al sabor"}
        );

        System.out.println(RubenSanchez.getProfileInfo());

    }

}