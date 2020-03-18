package lesson5;

public class Cat extends Animal {
    public static int maxRunDistance = 200;
    public static boolean swimSkill;
    public static double maxHeightJump = 2;


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println(this.name + " ran a distance " + distance);
        }else System.out.println(this.name + " can't run a distance " + distance + ". Max distance for cat: " + maxRunDistance);
    }

    @Override
    public void jump(double height){
        if (height <= maxHeightJump){
            System.out.println(this.name + " jumped over height " + height);
        } else System.out.println(this.name + " cannot jump to heights " + height + ". Max heights for horse: " + maxHeightJump);
    }

    @Override
    public void swim(int distance){
        if (swimSkill == false){
            System.out.println(this.name + " can`t swim");
        } else System.out.println(this.name + " swam the distance " + distance); // не должно вызываться
    }


}
