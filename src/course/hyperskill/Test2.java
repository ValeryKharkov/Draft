package course.hyperskill;

public class Test2 {
    public static void main(String[] args) {
        Human.averageWorking();

        Human h1 = new Human();
        h1.name = "Peter";
        h1.work();

        Human h2 = new Human();
        h2.name = "Max";
        h2.work();

        h1.workTogetherWith(h2);
    }
}

class Human {
    String name;
    int age;

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work() {
        System.out.println(this.name + " loves working!");
    }

    public void workTogetherWith(Human other) {
        System.out.println(this.name + " loves working with " + other.name + '!');
    }

}
