public class Rabbit extends Animal {
    private String eyeColor;

    public Rabbit(String name, String eyeColor) {
        this.name = name;
        this.eyeColor = eyeColor;
    }

    public void play() {
        System.out.println("Rabbit: " + this.name + " is being still");
    }
}
