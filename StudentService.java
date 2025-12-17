import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student deleted");
    }

    public void updateStudent(int id, String name, int age, String course) {
        boolean found = false;

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setCourse(course);
                found = true;
                System.out.println("Student updated successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }
}
