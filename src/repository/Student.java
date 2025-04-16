package repository;

/**
 * Класс сущности
 */
public class Student {
    private int id;
    private String name;
    private String email;

    /** Конструктор для инициализации полей
     * @param id
     * @param name
     * @param email
     */
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /** Сеттеры и геттеры для доступа к полям
     *
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    /** Метод для вывода информации класса
     *
     */
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}
