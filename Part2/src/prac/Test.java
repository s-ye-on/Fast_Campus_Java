package prac;

public class Test {
    public static void main(String[] args){
        Person person1 = new Person("Edward", 50000);
        Taxi taxi1 = new Taxi("돈 좀 주라");

        person1.takeTaxi(taxi1);
        person1.showPersonInfo();
        taxi1.showTaxiInfo();
    }
}
