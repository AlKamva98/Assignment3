public class Cow extends Animal {


    public Cow() {
    super();
    }

    public Cow(String name, String color, double height, int age) {
        super(name, color, height, age);
    }

    @Override
    public String talk(){
        return "Moooo";
    }

    @Override
    public String eats(){
        return "grass";
    }
}
