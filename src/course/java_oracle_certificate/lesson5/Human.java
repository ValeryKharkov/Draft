package course.java_oracle_certificate.lesson5;

public class Human {
    String name;
    Car2 car;
    BankAccount ba;

    void showInfo(){
        System.out.println("name:" + name);
        System.out.println("car:" + car.color);
        System.out.println("ba:" + ba.balance);
    }
}

class Car2 {
    Car2(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    String color = "Red";
    String engine;
}

class BankAccount{
    BankAccount (int i, double bal) {
        id = i;
        balance = bal;
    }
    int id;
    double balance;
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Jack";
        h.car = new Car2("Blue", "V4");
        h.ba = new BankAccount(1, 10.5);

        h.showInfo();

    }
}