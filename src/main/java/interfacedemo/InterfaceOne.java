package interfacedemo;

public interface InterfaceOne {
    void getMyName(String name);

    default  void display(){
        System.out.println("Hello I'm from the interfaceOne");
    }
}
