package humanpackage;

public class Human {
    String name;
    int age;
    boolean isMarried;
    double weight;
    Human(String name,int age,boolean isMarried,double weight){
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drink(){
        System.out.println(this.name + " is drinking");
    }
}
