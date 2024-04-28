package ch04;

public class Student {
    public int studentID;
    public String studentName;
    public String address;
    //학생 속성 3개


    //메서드 ( 학생의 정보를 보여주는 메서드)
    public void showStudentInfo() {
        System.out.println(studentID + "학번의 이름은" + studentName + "이고 주소는"
                + address + "입니다");
    }

        //StudentName을 가져가는 함수를 만들어보자
        public String getStudentName(){
            return studentName;

    }

    //학생 이름 바꾸는 것 매개 변수로 어떤 이름으로 바꿀건지 ()안이 매개변수
    public void setStudentName(String name){
        studentName = name;
        //여기서 name은 매개변수로 들어온 name
    }

}
