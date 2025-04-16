package repository;

/**
 * Интерфейс, в котором определены методы для реализации классом репозитория
 */
public interface StudentRepository {
    public Student getStudentById(int id);
    public void addStudent(Student s);
    public void updateStudent(Student s);
    public void deleteStudent(int id);
    public boolean exists(int id);

}
