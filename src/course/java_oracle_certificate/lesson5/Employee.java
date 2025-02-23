package course.java_oracle_certificate.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    EmployeeConstructor salary;
    String department;

    void upSalary2x (double salary) {
        salary = salary * 2;
    }

    void showInfo(){
        System.out.println(salary);
    }
}

class EmployeeConstructor{
    int id;
    String surname;
    int age;
    double salary;
    String department;

    EmployeeConstructor(double salary) {
        this.salary = salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.salary = new EmployeeConstructor(400);
        emp1.upSalary2x(300.0);

        emp1.showInfo();


    }
}

