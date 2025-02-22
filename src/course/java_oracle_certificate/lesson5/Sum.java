// Урок 5. Создание объектов. Понятие «конструктор». Объявление и вызов методов
package course.java_oracle_certificate.lesson5;

public class Sum {

    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

class SumTest {
    public static void main(String[] args) {
        Sum sum3Digit = new Sum();

        int result = sum3Digit.sum(2, 4, 6);

        System.out.println(result);
    }
}
