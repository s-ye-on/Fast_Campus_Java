package prac;

public class Person {
    int money;
    String name;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }
    public void takeTaxi(Taxi taxi){
        this.money -=10000;
        taxi.take(10000);
    }
    public void showPersonInfo(){
        System.out.println(name + "님의 남은 돈은" + money +"원 입니다");
    }
}
