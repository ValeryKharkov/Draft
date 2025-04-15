package repository;

import java.util.HashMap;

/**
 * Класс для реализации методов, определенных в интерфейсе StudentRepository
 */
public class StudentRepositoryImpl implements StudentRepository {

    private HashMap<Integer, Student> students;

    public StudentRepositoryImpl()
    {students = new HashMap<>();}

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void addStudent(Student s) {

    }

    @Override
    public void updateStudent(Student s) {

    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public boolean exists(int id) {
        return false;
    }
}
