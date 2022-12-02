package it.develhope.constructor;

public class Student {

    private String name;
    public int grade;

    public Student(String studentName){
        this.name = studentName;
        System.out.println("There it is the new student");
    }

    public void getStudentDetails(){
        System.out.println("Student name: " + name + " - " + "Student grade: " + grade);
    }
}
