package repository;

/**
 * Интерфейс, где определяются методы, которые должны быть реализованы конкретным классом репозитория
 */
public interface StudentRepository {
    public Student getStudentById(int id);
    public void addStudent(Student s);
    public void updateStudent(Student s);
    public void deleteStudent(int id);
    public boolean exists(int id);

}
