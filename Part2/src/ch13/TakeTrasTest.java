package ch13;

public class TakeTrasTest {
    public static void main (String args[]){

        Student James = new Student("James", 12000);
        Student Tomas = new Student("Tomas", 35000);

        Bus bus100 = new Bus(100);
        Bus bus120 = new Bus(120);
        James.takeBus(bus100);

        Subway subway1 = new Subway(1);
        Subway subway2 = new Subway(2);

        James.showStudentInfo();
        bus100.showBusInfo();

        System.out.println();

        Tomas.takeSubway(subway2);

        Tomas.showStudentInfo();
        subway2.showSubwayInfo();
    }
}
