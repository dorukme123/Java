package humanpackage;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("duirel",23,true,98.5);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.isMarried);
        System.out.println(human.weight);

        Human human2 = new Human("meric",22,false,96.5);
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.isMarried);
        System.out.println(human2.weight);

        human2.eat();
        human.drink();
    }
}