public class Sheep extends Animal {
    public Sheep() {
        super();
    }

    public Sheep(String name, String color, double height, int age) {
        super(name, color, height, age);
    }

    @Override
    public String talk(){
        return "Baaaaa";
    }

    @Override
    public String eats() {
        return "grass";
    }
}
