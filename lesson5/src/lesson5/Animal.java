package lesson5;
public abstract class Animal extends Object {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public abstract void jump(double height);
}
