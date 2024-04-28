package ch06;

// 2-06 생성자
public class Student {
    // 멤버변수
    public int studentNumber;
    public String studentName;
    public int grade;


    //클래스에는 반드시 적어도 하나 이상의 생성자 존재, 클래스에 생성자 하나도 없어도 컴파일러가 생성자 코드 넣어줌
    // -> 기본 생성자
    //생성자
    // 생성자는 보통 클래스 이름과 같음
    public Student(int studentNumber, String studentName, int grade){
        System.out.println("student 생성");
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    //디폴트 생성자도 사용하고싶을 경우 직접 만들어놓으면 됨
    //디폴트 생성자
    public Student(){}

    public String showStudentInfo(){
        return studentNumber + "학번 학생의 이름은" + studentName + " 이고, " + grade + "학년 입니다";
    }
}
