package interfacedemo;

public interface InterfaceTwo {
    void getMyName(String name);

    default  void display(){
        System.out.println("Hello I'm from the interfaceTwo");
    }
}
