import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner obj for input from user
        Scanner sc = new Scanner(System.in);

        // Create an instance of StudentManager to manage students
        StudentManager manager = new StudentManager();

        // Loop assigned
        boolean running = true;

        while(running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    // Get input to add a new student
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    // Create and add student
                    manager.addStudent(new Student(id, name, age, course));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Get ID and remove student
                    System.out.print("Enter Student ID to remove: ");
                    String removeId = sc.nextLine();
                    manager.removeStudent(removeId);
                    System.out.println("Student removed if ID was found.");
                    break;

                case 3:
                    // View specific student
                    System.out.print("Enter Student ID to view: ");
                    String viewId = sc.nextLine();
                    Student student = manager.getStudent(viewId);
                    if (student != null)
                        System.out.println(student);
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    // Show all students
                    manager.displayStudents();
                    break;

                case 5:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();     // avoiding unnecessary memory usage
    }
}
