package ch13;

public class Subway {
    int lineNumber;
    int money;
    int passengerCount;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;

    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showSubwayInfo(){
        System.out.println(lineNumber +"지하철의 승객수는" + passengerCount +"이고 수입은" + money +" 원 입니다");
    }
}
