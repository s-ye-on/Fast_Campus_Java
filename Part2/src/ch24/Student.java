package ch24;

import java.util.ArrayList;

public class Student {

    String studentName;
    int studentId;

    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();

    }

    public void addSubject(String subjectName, int score){
        Subject subject = new Subject();

        subject.setSubjectName(subjectName);
        subject.setScore(score);
        subjectList.add(subject);
    }
    public void showStudentInfo(){
        int total =0;

        for(Subject s : subjectList){
            total += s.getScore();
            System.out.println(studentName + "학생의 " + s.getSubjectName() +"과목의 점수는" + s.getScore());
        }
        System.out.println(studentName + "학생의 총점은 " + total);
    }

}
