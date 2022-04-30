package mypackage;

public class Hero extends Person {

    String power;
    Hero(String name,int age,String power){
        super(name,age); // calls the parent classes constructor.
        this.power = power;
    }
    @Override
    public String toString(){
        return super.toString()+this.power;
        // this super refers to the toString method that we had overwritten
        // in the parent class
    }
}
