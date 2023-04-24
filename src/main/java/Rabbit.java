public class Rabbit extends Animal {
    private String eyeColor;

    public Rabbit(String name, int age, String eyeColor) {
        super(name, age);
    }

    public void play() {
        System.out.println("Rabbit: " + this.name + " is being still");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit: " + this.name + " is ignoring the toy " + toy);
    }
}
