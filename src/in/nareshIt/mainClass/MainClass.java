package in.nareshIt.mainClass;

import java.util.List;
import java.util.Scanner;

import in.nareshIt.beans.Student;
import in.nareshIt.fileIO.FileIO;
import in.nareshIt.studentManagement.StudentManagement;

public class MainClass {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        // Load saved students from file
        List<Student> savedStudents = FileIO.loadFromFile();
        if (savedStudents != null) {
            savedStudents.forEach(management::addStudent);
        }

        while (true) {
            System.out.println("\n1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Edit student");
            System.out.println("4. Delete student");
            System.out.println("5. Save and exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();
                    management.addStudent(new Student(name, id, grade));
                    break;

                case 2:
                    management.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.nextLine();
                    management.editStudent(editId, newName, newGrade);
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    management.deleteStudent(deleteId);
                    break;

                case 5:
                    FileIO.saveToFile(management.students);
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


