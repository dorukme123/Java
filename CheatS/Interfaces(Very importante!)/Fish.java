package mypackage;

public class Fish implements Prey,Predator{

    @Override
    public void flee() {
        System.out.println("Blobs in horror!");
    }

    @Override
    public void hunt() {
        System.out.println("Blobs furiously!");
    }
}
