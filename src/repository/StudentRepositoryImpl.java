package repository;

import java.util.HashMap;

/**
 * Класс для реализации методов, определенных в интерфейсе StudentRepository
 */
public class StudentRepositoryImpl implements StudentRepository
{
    private HashMap<Integer, Student> students;

    public StudentRepositoryImpl()
    {students = new HashMap<>();}

    @Override
    public Student getStudentById(int id)
    {return students.get(id);}

    @Override
    public void addStudent(Student s)
    {students.put(s.getId(), s);}

    @Override
    public void updateStudent(Student s)
    {
        (students.get(s.getId())).setName(s.getName());
        (students.get(s.getId())).setEmail(s.getEmail());
    }

    @Override
    public void deleteStudent(int id)
    {students.remove(id);}

    @Override
    public boolean exists(int id)
    {return students.containsKey(id);}
}
