public class Toy implements Action {
    private String brand;

    public Toy(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Toy of brand " + this.brand + " is making some weird sound");
    }
}
