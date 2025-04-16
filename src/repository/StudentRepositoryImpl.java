package repository;

import java.util.HashMap;

/**
 * Класс для предоставления конкретной реализации методов в интерфейсе
 */
public class StudentRepositoryImpl implements StudentRepository {

    /**
     * Хранилище объектов класса Student
     */
    private HashMap<Integer, Student> students;

    /**
     * Конструктор, который инициализирует хранилище объектов класса
     */
    public StudentRepositoryImpl()
    {students = new HashMap<>();}

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public void addStudent(Student s) {
        students.put(s.getId(), s);
    }

    @Override
    public void updateStudent(Student s) {
        (students.get(s.getId())).setName(s.getName());
        (students.get(s.getId())).setEmail(s.getEmail());
    }

    @Override
    public void deleteStudent(int id) {
        students.remove(id);
    }

    @Override
    public boolean exists(int id) {
        return students.containsKey(id);
    }
}
