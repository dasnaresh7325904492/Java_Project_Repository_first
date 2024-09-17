package in.nareshIt.studentManagement;

import java.util.ArrayList;
import java.util.List;

import in.nareshIt.beans.Student;

public class StudentManagement {
    public List<Student> students;

    // Constructor
    public StudentManagement() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Edit student by ID
    public void editStudent(int id, String newName, String newGrade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setGrade(newGrade);
                System.out.println("Student updated: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student with ID " + id + " has been deleted.");
    }
}


