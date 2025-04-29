class Parent{
    String name;
    int age;
    String department;

    void work(){
        System.out.println(name + " is working.");
    }
    void attendMeeting(){
        System.out.println(name + " is attending a meeting.");
    }
}

class Child extends Parent{
    void conductMeeting(){
        System.out.println(name + " is conducting a meeting.");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Parent pr = new Parent();
        pr.name = "Senku's Parent"; // Let's give the parent a different name to distinguish
        pr.age = 45;
        pr.department = "Management";

        pr.work();
        pr.attendMeeting();

        Child ch = new Child();
        ch.name = "Senku";
        ch.age = 19;
        ch.department = "Science";

        ch.work(); // Child can also work (inherited from Parent)
        ch.attendMeeting(); // Child can also attend meetings (inherited from Parent)
        ch.conductMeeting(); // Child has its own conductMeeting method
    }
}