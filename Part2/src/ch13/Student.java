package ch13;

public class Student {

    private String studentName;
    private String grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -=1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -=1200;
    }

    public void showStudentInfo(){
        System.out.println(studentName + "님의 남은돈은 " + money + "입니다") ;
    }
}
