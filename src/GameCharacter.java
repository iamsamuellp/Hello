public class GameCharacter {
    private int health;
    private int height;
    private String personality;
    private String gender;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    private String name;

    public int getHeight() {
        return height;
    }

    public GameCharacter( String name,String personality, String gender,int health,int height) {
        this.health = health;

        this.height = height;

        this.personality = personality;

        this.gender = gender;

        this.name = name;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health=" + health +
                ", height=" + height +
                ", personality='" + personality + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        GameCharacter char1 = new GameCharacter("Erif God Of Fire", "excited", " Male", 98, 6);
        GameCharacter char2 = new GameCharacter("Windtyde God Of the Air","Lazy", "Male", 100, 7);
        GameCharacter char3 = new GameCharacter("Karma The God of Wrath", "Calm", "female", 100,5);


    }

}
