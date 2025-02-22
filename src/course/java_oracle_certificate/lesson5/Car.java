package course.java_oracle_certificate.lesson5;

public class Car {
    String color;
    String engine;
    int speed;
    CarConstructor car;

    int doUpSpeed(int upSpeed) {
        speed += upSpeed;
        return speed;
    }

    int doDownSpeed(int downSpeed) {
        speed -= downSpeed;
        return speed;
    }

   void showInfo() {
       System.out.println("color:" + color);
       System.out.println("engine:" + engine);
       System.out.println("speed:" + speed);
    }

    static class CarConstructor {
        String color;
        String engine;

        CarConstructor(String color, String engine){
            this.color = color;
            this.engine = engine;
        }

    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();

        c1.doUpSpeed(60);

        c1.showInfo();

        c1.doDownSpeed(20);

        c1.showInfo();
    }
}
