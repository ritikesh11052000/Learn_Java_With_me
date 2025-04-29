
class Employee{
    String name;
    int age;
    String department;

    void work(){
        System.out.println(name  +" is working");
    }

    void attendMeeting(){
        System.out.println(name +" is Attending a meeting.");
    }
}

public class Employee_Ex{
    public static void main(String[] args){
        Employee employee_1 = new Employee();

        employee_1.name = "Tsukasa";
        employee_1.age = 20 ;
        employee_1.department = "HR ";

        employee_1.work();
        employee_1.attendMeeting();
    }
}