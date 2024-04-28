package ch24;

public class StudentTest {
    public static void main(String[] args){

        Student studentLee = new Student(1234, "Lee");

        studentLee.addSubject("국어", 86);
        studentLee.addSubject("수학", 92);

        studentLee.showStudentInfo();
    }
}
