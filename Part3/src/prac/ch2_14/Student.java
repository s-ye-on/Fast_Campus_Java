package prac.ch2_14;

public class Student {
    String studentName;
    int money;

    public Student(){
        this("이름없음", 0);
    }
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        money -= 1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        money -=1200;
    }
    public void showStudentInfo(){
        System.out.println(studentName + "학생의 잔돈은" +money);
    }
}
