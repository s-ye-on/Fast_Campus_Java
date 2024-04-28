package ch04;

public class StudentTest {
    public static void main( String[] args){

        //Student가 그냥 데이터 타입
        // new Student(); == 생성자
        Student studentLee = new Student(); // -> 인스턴스 ( 클래스를 기반으로 만든 인스턴스) 여러개 가능


        studentLee.studentID = 12345;

        studentLee.setStudentName("Lee");  //멤버 변수 사용
        studentLee.address = "서울 강남구 ";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.address = "서울";
        studentKim.studentName = "Kim";

        // studentLee , studentKim 참조변수 -> 참조되는 메모리의 위치를 나타냄
        studentKim.showStudentInfo();

    }
}
