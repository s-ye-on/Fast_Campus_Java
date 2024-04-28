package ch09;

public class SubjectTest {
    public static void main (String args[]){

        Student studentLee = new Student(2020, "Lee");
        Student studentKim = new Student(2021, "Kim");

        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 80);

        studentKim.setKoreaSubject("국어", 60);
        studentKim.setMathSubject("수학", 40);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();

    }
}
