public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   public void play() {
        System.out.println("Cat: " + this.name + " jumps on the table");
    }
}
