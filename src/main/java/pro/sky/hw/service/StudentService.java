package pro.sky.hw.service;

import org.springframework.stereotype.Service;
import pro.sky.hw.model.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private Map<Long, Student> students = new HashMap<>();
    private Long nextId = 0L;

    public Student createStudent(Student student) {
        student.setId(++nextId);
        students.put(nextId, student);
        return student;
    }

    public Student getStudent(Long id) {
        return students.get(id);
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student editStudent(Student student) {
        return students.put(student.getId(), student);
    }

    public Student removeStudent(Long id) {
        return students.remove(id);
    }

    public Collection<Student> getStudentsWithAge(int age) {
        return students.values().stream()
                .filter(e -> e.getAge() == age)
                .collect(Collectors.toSet());
    }
}
