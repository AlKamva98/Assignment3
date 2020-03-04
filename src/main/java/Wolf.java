public class Wolf extends Animal {
    public Wolf() {
    super();
    }

    public Wolf(String name, String color, double height, int age) {
        super(name, color, height, age);
    }

    @Override
    public String talk(){
        return "Woof";
    }

    @Override
    public String eats() {
        return "Meat";
    }
}
