public class Toy implements Action {
    private String name;

    public Toy(String brand) {
        this.name = brand;
    }

    public void play() {
        System.out.println("the toy " + this.name + " is making some weird sound");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("the toy " + this.name + " is happy to see another toy " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}
