package prac.chap2ch19;

public class Car {

    private static int serialNum = 10000;
    public int carNum;
    public Car(){
        carNum = serialNum;
        serialNum++;
    }
    public int getCarNum(){
        return carNum;
    }
}
