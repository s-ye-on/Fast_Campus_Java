package ch06;

public class StudentTest {
    public static void main(String[] args){

        //만든 생성자 사용
        Student studentLee = new Student(200, "Lee", 3);

        // 디폴트 생성자 사용
        Student studentKim = new Student();
        System.out.println(studentKim.showStudentInfo());
        System.out.println(studentLee.showStudentInfo());

    }
}
