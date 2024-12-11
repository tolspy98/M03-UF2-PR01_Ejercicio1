public class Perfil {
    private String name;
    private String story;
    private String[] hobbies;
    private String[] foods;
    private String[] funFacts;


    public Perfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public String getFormattedHobbies() {
        return formatArray("Hobbies", hobbies);
    }

    public String getFormattedFoods() {
        return formatArray("Comidas favoritas", foods);
    }

    public String getFormattedFunFacts() {
        return formatArray("Datos curiosos", funFacts);
    }

    private String formatArray(String title, String[] items) {
        StringBuilder formatted = new StringBuilder(title + ":\n");
        for (String item : items) {
            formatted.append("- ").append(item).append("\n");
        }
        return formatted.toString();
    }

    public String getProfileInfo() {
        return "Nombre: " + name + "\n" +
                "Historia: " + story + "\n\n" +
                getFormattedHobbies() + "\n" +
                getFormattedFoods() + "\n" +
                getFormattedFunFacts();
    }

}
