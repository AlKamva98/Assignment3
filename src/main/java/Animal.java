public abstract class Animal {

    private String name;
    private String color;
    private double height;
    private int age;

    public Animal() {
    }

    public Animal(String name, String color, double height, int age) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String talk();
    public abstract String eats();

    @Override
    public String toString() {
        return "My name is'" + name + '\'' +
                ", color is " + color + '\'' +
                ", height is " + height +
                ", and age is " + age;
    }
}
