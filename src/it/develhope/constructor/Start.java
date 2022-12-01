package it.develhope.constructor;

public class Start {

    public static void main(String[] args) {

        Student student1 = new Student("Lorenzo");
        Student student2 = new Student("Silvia");

        Teacher teacher = new Teacher();
        teacher.teacherName = "Barbara";
        System.out.println("---------------------");


        teacher.assignGrade(student1, 3);
        teacher.assignGrade(student2, 1);

        student1.getStudentDetails();
        System.out.println("---------------------");
        student2.getStudentDetails();
    }
}
