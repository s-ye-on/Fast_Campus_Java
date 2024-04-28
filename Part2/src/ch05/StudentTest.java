package ch05;

public class StudentTest {
    public static void main(String[] args){

        // 디폴트 생성자는 생성자가 만들어지지 않았을 때 제공
        // 생성자 만들어졌을 때 디폴트 생성자 사용하면 오류 발생
        // Student studentLee = new Student(); -> 디폴트 생성자
        //디폴트 생성자도 사용하고 싶을 경우 클래스에 직접 디폴트 생성자 만들어줌

        Student studentLee = new Student(1234, "Lee", 3);
        Student studentKim = new Student(); // 기본생성자도 커스토머 코드에 구현했기에 사용 가능

        //멤버 변수는 만들어지면 기본값으로 자동 초기화
        // 지역 변수는 자동 초기화 x


        System.out.println(studentLee.showStudentInfo());
    }
}
