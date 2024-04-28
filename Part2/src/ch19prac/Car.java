package ch19prac;

public class Car {
    private static int serialNum = 10000;
    private int carNum;

    public Car (){
        carNum = serialNum;
        serialNum++;
    }
    public int getCarNum(){
        return carNum;
    }
}
