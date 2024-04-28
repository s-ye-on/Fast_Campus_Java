package ch09;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;
    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        //참조 변수를 멤버변수 자료형으로 쓴 경우 생성자에서 보통 선언
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
        System.out.println(studentName +"학생의 총점은" + total +"점 입니다" + studentID);


    }

    //이 강의에서 중요한게 Subject 클래스에 변수들 선언해논거 참조해서(가져와서) 쓸수있고
    // 이 경우 new 해서 생성해주고 써야한다
}
