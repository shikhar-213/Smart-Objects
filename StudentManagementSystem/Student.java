public class Student {
    private String studentId;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize the object.
    public Student (String studentId, String name, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters & Setters
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    // Overriding toString method to display student details
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}