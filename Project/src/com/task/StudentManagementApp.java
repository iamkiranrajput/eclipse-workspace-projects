package com.task;



import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementApp system = new StudentManagementApp();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student student = new Student(name, rollNumber, grade);
                    system.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the roll number to remove: ");
                    int rollToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter the roll number to search: ");
                    int rollToSearch = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Student foundStudent = system.searchStudent(rollToSearch);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("All Students:");
                    system.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

	private Student searchStudent(int rollToSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	private void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	private void displayAllStudents() {
		// TODO Auto-generated method stub
		
	}

	private void removeStudent(int rollToRemove) {
		// TODO Auto-generated method stub
		
	}
}
