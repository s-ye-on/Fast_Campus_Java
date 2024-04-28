package prac.ch2_14;

public class Test {
    public static void main(String [] args){

        Student studentLee = new Student("Lee", 10000);
        Bus bus505 = new Bus(505);
        Subway subway2 = new Subway(2);

        studentLee.takeSubway(subway2);
        studentLee.takeBus(bus505);

        studentLee.showStudentInfo();
        bus505.showBusInfo();
        subway2.showSubwayInfo();


    }
}
