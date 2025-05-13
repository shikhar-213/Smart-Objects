import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(String studentId) {
        studentList.removeIf(student -> student.getStudentId().equals(studentId));
    }

    // Get a student object by ID
    public Student getStudent(String studentId) {
        for(Student student : studentList) {
            if(student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    // Display all student in the list
    public void displayStudents() {
        if(studentList.isEmpty()) {
            System.out.println("No Student Found!");
        }
        else {
            for(Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}
