package interfacedemo;

public class Main implements InterfaceOne, InterfaceTwo {
    @Override
    public void getMyName(String name) {
        System.out.println("My Name is " + name);
    }

    @Override
    public void display() {
        InterfaceTwo.super.display();
        InterfaceOne.super.display();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getMyName("Abhishek Kumar");
        main.display();
    }
}
