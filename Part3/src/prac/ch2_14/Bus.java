package prac.ch2_14;

public class Bus {

    int busNum;
    int income;
    int passenger;

    public Bus(int busNum){
        this.busNum = busNum;
        income =0;
        passenger=0;
    }
    public void take(int money){
        income += money;
        passenger++;
    }
    public void showBusInfo(){
        System.out.println(busNum + "번 버스의 수입은" + income + "승객수는" + passenger);
    }
}
