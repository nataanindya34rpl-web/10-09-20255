import java.rmi.server.RemoteObjectInvocationHandler;

public class Teacher {
    // Atribut
    String subject;
    String name;
    double salary;
    int age;

    // Constructor
    public Teacher(String subject, String name, double salary, int age) {
        this.subject = subject;
        this.name = name;
        this.salary = salary;
        this.age = age;
    
    }
    // Getter dan Setter
    public String getSubject() {
        return subject;
    }   

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Method print
    public void print() {
        System.out.println("=== Data Teacher ===");
        System.out.println("Name    : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Salary  : " + salary);
        System.out.println("Age     : " + age);
    }
}


