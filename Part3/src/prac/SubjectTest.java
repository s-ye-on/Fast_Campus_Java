package prac;

public class SubjectTest {
    public static void main(String[] args){
        Student studentLee = new Student("Lee", 1234);
        studentLee.setKoreaSubject("국어", 80);
        studentLee.setMathSubject("수학", 84);

        Student studentKim = new Student("Kim",1313);
        studentKim.setKoreaSubject("국어", 40);
        studentKim.setMathSubject("수학", 32);


        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
