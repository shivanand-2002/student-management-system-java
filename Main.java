import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            try {
                System.out.println("\n1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        service.addStudent(new Student(id, name, age, course));
                        break;

                    case 2:
                        service.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter ID to update: ");
                        int updId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Course: ");
                        String newCourse = sc.nextLine();

                        service.updateStudent(updId, newName, newAge, newCourse);
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int delId = sc.nextInt();
                        sc.nextLine();
                        service.deleteStudent(delId);
                        break;

                    case 5:
                        System.out.println("Thank you");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine(); // clear wrong input
            }
        }
    }
}
