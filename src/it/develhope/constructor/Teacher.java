package it.develhope.constructor;

public class Teacher {

    public String teacherName;

    public Teacher(){
        System.out.println("There it is the teacher");
    }

    public void assignGrade(Student alum, int finalGrade){
       alum.grade = finalGrade;
    }

    /*  public int assignGrade(Student alum, int finalGrade){
       alum.grade = finalGrade;
       return alum.grade
    } ho notato che funziona anche scritto così, c'è un modo migliore per farlo o è indifferente? */
}
