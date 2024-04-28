package prac;

public class Student {
    String studentName;
    int studentId;

    Subject korea;
    Subject math;

    public Student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;

        korea = new Subject();
        math = new Subject();

        }
        public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
        }
        public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
        }
        public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총점은 " + total +"점 입니다");
        }
}
