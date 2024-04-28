package ch05;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;


    //Student 생성자 -> 아무것도 없어도 되고 안만들어도됨 ( 자바에서 알아서 기본 생성자 만들어줌)

    public Student() {}   //디폴트 생성자 만들어줌
    // 디폴트 생성자 만들어주면 클라이언트 코드에서 디폴트 생성자 사용 가능


    public Student(int studentNumber, String studentName, int grade){
        this. studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
        // 멤버 변수 this.~
        // this.멤버 변수 = 매개변수 ;
    }

    public String showStudentInfo(){
        return studentName + "학생의 학번은" + studentNumber + "이고, " + grade +"학년 입니다";
    }
}
